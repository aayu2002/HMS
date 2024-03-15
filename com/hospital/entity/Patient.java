package com.hospital.entity;

import javax.persistence.*;

@Entity
public class Patient {
    @Id
    private String p_id; // Patient ID

    private String fname; // First name
    private String lname; // Last name
    private String gender; // Gender
    private String disease; // Disease
    private String admitstatus; // Admission status
    private int age; // Age
    private String phone_no; // Phone number

    // Default constructor
    public Patient() {

    }

    // Parameterized constructor
    public Patient(String p_id, String fname, String lname, String gender, String disease, String admitstatus, int age, String phone_no) {
        this.p_id = p_id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.disease = disease;
        this.admitstatus = admitstatus;
        this.age = age;
        this.phone_no = phone_no;
    }

    // Getters and Setters

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public String getAdmitstatus() {
        return admitstatus;
    }

    public void setAdmitstatus(String admitstatus) {
        this.admitstatus = admitstatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    // toString method to represent Patient object as a string
    @Override
    public String toString() {
        return "Patient{" +
                "p_id='" + p_id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", admitstatus='" + admitstatus + '\'' +
                ", age=" + age +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }
}
