package com.example.entity;

/**
 * Represents a Staff member in Hospital Management System.
 * The Staff class stores information about an individual staff member.
 */
public class Staff {
    private int sId;            // Unique identifier for the staff member
    private String fname;       // First name of the staff member
    private String lname;       // Last name of the staff member
    private String gender;      // Gender of the staff member
    private String designation; // Designation or role of the staff member
    private int age;            // Age of the staff member
    private double salary;      // Salary of the staff member


    /**
     * Gets the unique identifier of the staff member.
     *
     * @return The staff member's unique identifier.
     */
    public int getsId() {
        return sId;
    }

    /**
     * Sets the unique identifier of the staff member.
     *
     * @param sId The new unique identifier for the staff member.
     */
    public void setsId(int sId) {
        this.sId = sId;
    }

    /**
     * Gets the first name of the staff member.
     *
     * @return The first name of the staff member.
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the first name of the staff member.
     *
     * @param fname The new first name for the staff member.
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * Gets the last name of the staff member.
     *
     * @return The last name of the staff member.
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the last name of the staff member.
     *
     * @param lname The new last name for the staff member.
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * Gets the gender of the staff member.
     *
     * @return The gender of the staff member.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the staff member.
     *
     * @param gender The new gender for the staff member.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the designation or role of the staff member.
     *
     * @return The designation or role of the staff member.
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the designation or role of the staff member.
     *
     * @param designation The new designation or role for the staff member.
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Gets the age of the staff member.
     *
     * @return The age of the staff member.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the staff member.
     *
     * @param age The new age for the staff member.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the salary of the staff member.
     *
     * @return The salary of the staff member.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the staff member.
     *
     * @param salary The new salary for the staff member.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Overrides the default toString method to provide a string representation of the Staff object.
     *
     * @return A string representation of the Staff object.
     */
    @Override
    public String toString() {
        return "Staff{" +
                "sId=" + sId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender='" + gender + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
