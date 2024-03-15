package com.hospital.entity;

import javax.persistence.*;

@Entity
public class Staff {
    @Id
    private String staffId; // Staff ID

    private String firstName; // First name
    private String lastName; // Last name
    private String gender; // Gender
    private String designation; // Designation
    private int age; // Age
    private double salary; // Salary

    // Default constructor
    public Staff() {}

    // Parameterized constructor
    public Staff(String staffId, String firstName, String lastName, String gender, String designation, int age, double salary) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to represent Staff object as a string
    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
