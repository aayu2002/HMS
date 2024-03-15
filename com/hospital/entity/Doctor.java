package com.hospital.entity;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    private String d_id; // Doctor ID

    private String d_name; // Doctor name
    private String qualification; // Qualification
    private String specialization; // Specialization
    private String availability; // Availability

    // Default constructor
    public Doctor() {}

    // Parameterized constructor
    public Doctor(String d_id, String d_name, String qualification, String specialization, String availability) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.qualification = qualification;
        this.specialization = specialization;
        this.availability = availability;
    }

    // Getters and Setters

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
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

    // toString method to represent Doctor object as a string
    @Override
    public String toString() {
        return "Doctor{" +
                "d_id='" + d_id + '\'' +
                ", d_name='" + d_name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
