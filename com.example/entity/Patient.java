package com.example.entity;

/**
 * Represents a Patient in a hospital management system.
 */
public class Patient {
    private int pId;            // Unique identifier for the patient
    private String fname;       // First name of the patient
    private String lname;       // Last name of the patient
    private String gender;      // Gender of the patient
    private String disease;     // Disease or condition the patient is diagnosed with
    private boolean admitStatus; // Admission status of the patient (admitted or not)
    private int age;            // Age of the patient
    private String phoneNo;     // Phone number of the patient

    /**
     * Gets the unique identifier of the patient.
     *
     * @return The patient's unique identifier.
     */
    public int getpId() {
        return pId;
    }

    /**
     * Sets the unique identifier of the patient.
     *
     * @param pId The new unique identifier for the patient.
     */
    public void setpId(int pId) {
        this.pId = pId;
    }

    /**
     * Gets the first name of the patient.
     *
     * @return The first name of the patient.
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the first name of the patient.
     *
     * @param fname The new first name for the patient.
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * Gets the last name of the patient.
     *
     * @return The last name of the patient.
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the last name of the patient.
     *
     * @param lname The new last name for the patient.
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * Gets the gender of the patient.
     *
     * @return The gender of the patient.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the patient.
     *
     * @param gender The new gender for the patient.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the disease or condition the patient is diagnosed with.
     *
     * @return The disease or condition of the patient.
     */
    public String getDisease() {
        return disease;
    }

    /**
     * Sets the disease or condition of the patient.
     *
     * @param disease The new disease or condition for the patient.
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }

    /**
     * Checks the admission status of the patient.
     *
     * @return True if the patient is admitted, false otherwise.
     */
    public boolean isAdmitStatus() {
        return admitStatus;
    }

    /**
     * Sets the admission status of the patient.
     *
     * @param admitStatus The new admission status for the patient.
     */
    public void setAdmitStatus(boolean admitStatus) {
        this.admitStatus = admitStatus;
    }

    /**
     * Gets the age of the patient.
     *
     * @return The age of the patient.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the patient.
     *
     * @param age The new age for the patient.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the phone number of the patient.
     *
     * @return The phone number of the patient.
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the phone number of the patient.
     *
     * @param phoneNo The new phone number for the patient.
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Overrides the default toString method to provide a string representation of the Patient object.
     *
     * @return A string representation of the Patient object.
     */
    @Override
    public String toString() {
        return "Patient{" +
                "pId=" + pId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", admitStatus=" + admitStatus +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
