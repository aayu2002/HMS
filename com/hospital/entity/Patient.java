package com.hospital.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @Column(name = "p_id")
    private String patientId;

    @Column(name = "fname")
    private String firstName;

    @Column(name = "lname")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "disease")
    private String disease;

    @Column(name = "admitstatus")
    private String admitStatus;

    @Column(name = "age")
    private int age;

    @Column(name = "phone_no")
    private String phoneNumber;

    @OneToOne(mappedBy = "patient")
    private Bill bill;
    @OneToMany
    private List<Payment> payments;

    @ManyToMany
    @JoinTable(
            name = "doctor_patient",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private Set<Doctor> doctors = new HashSet<>();

    @ManyToMany(mappedBy = "patients")
    private Set<Staff> staffMembers = new HashSet<>();

    // Constructors, Getters, and Setters

    public Patient() {
    }

    public Patient(String patientId, String firstName, String lastName, String gender, String disease, String admitStatus, int age, String phoneNumber) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.disease = disease;
        this.admitStatus = admitStatus;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    // Getters and Setters (omitted for brevity)


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAdmitStatus() {
        return admitStatus;
    }

    public void setAdmitStatus(String admitStatus) {
        this.admitStatus = admitStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Set<Staff> getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(Set<Staff> staffMembers) {
        this.staffMembers = staffMembers;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", admitStatus='" + admitStatus + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
