package com.example.entity;

/**
 * Represents a Doctor in a hospital management system.
 * The Doctor class stores information about a medical professional.
 */
public class Doctor {
    private int dId;                // Unique identifier for the doctor
    private String dName;           // Name of the doctor
    private String qualification;   // Qualifications of the doctor
    private String specialization;  // Specialization area of the doctor
    private String availability;    // Availability schedule of the doctor

    /**
     * Gets the unique identifier of the doctor.
     *
     * @return The doctor's unique identifier.
     */
    public int getdId() {
        return dId;
    }

    /**
     * Sets the unique identifier of the doctor.
     *
     * @param dId The new unique identifier for the doctor.
     */
    public void setdId(int dId) {
        this.dId = dId;
    }

    /**
     * Gets the name of the doctor.
     *
     * @return The name of the doctor.
     */
    public String getdName() {
        return dName;
    }

    /**
     * Sets the name of the doctor.
     *
     * @param dName The new name for the doctor.
     */
    public void setdName(String dName) {
        this.dName = dName;
    }

    /**
     * Gets the qualifications of the doctor.
     *
     * @return The qualifications of the doctor.
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * Sets the qualifications of the doctor.
     *
     * @param qualification The new qualifications for the doctor.
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /**
     * Gets the specialization area of the doctor.
     *
     * @return The specialization area of the doctor.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the specialization area of the doctor.
     *
     * @param specialization The new specialization area for the doctor.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Gets the availability schedule of the doctor.
     *
     * @return The availability schedule of the doctor.
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the availability schedule of the doctor.
     *
     * @param availability The new availability schedule for the doctor.
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Overrides the default toString method to provide a string representation of the Doctor object.
     *
     * @return A string representation of the Doctor object.
     */
    @Override
    public String toString() {
        return "Doctor{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
