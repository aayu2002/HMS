package com.hospital.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Doctor {
    @Id
    @Column(name = "d_id")
    private String doctorId;

    @Column(name = "d_name")
    private String doctorName;

    private String qualification;
    private String specialization;
    private String availability;

    @ManyToMany(mappedBy = "doctors")
    private Set<Patient> patients = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "doctor_staff",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_id")
    )
    private Set<Staff> staffMembers = new HashSet<>();

    // Constructors, Getters, and Setters


    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Set<Staff> getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(Set<Staff> staffMembers) {
        this.staffMembers = staffMembers;
    }

    public Doctor() {
    }

    public Doctor(String doctorId, String doctorName, String qualification, String specialization, String availability) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.qualification = qualification;
        this.specialization = specialization;
        this.availability = availability;
    }

    // Getters and Setters (omitted for brevity)

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
