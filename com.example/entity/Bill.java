package com.example.entity;

/**
 * Represents a Bill in a hospital management system.
 * The Bill class stores information about the charges incurred by a patient.
 */
public class Bill {
    private int bId;                // Unique identifier for the bill
    private double basicCharges;    // Basic charges for healthcare services
    private double additionalCharges; // Additional charges for extra services
    private double medicationCharges; // Charges for medications
    private double roomCharges;      // Charges for room accommodations
    private double doctorFees;       // Charges for doctor's fees
    private double totalCharges;     // Total charges for the bill
    private int patientId;           // Identifier of the associated patient


    /**
     * Gets the unique identifier of the bill.
     *
     * @return The bill's unique identifier.
     */
    public int getbId() {
        return bId;
    }

    /**
     * Sets the unique identifier of the bill.
     *
     * @param bId The new unique identifier for the bill.
     */
    public void setbId(int bId) {
        this.bId = bId;
    }

    /**
     * Gets the basic charges for healthcare services.
     *
     * @return The basic charges for healthcare services.
     */
    public double getBasicCharges() {
        return basicCharges;
    }

    /**
     * Sets the basic charges for healthcare services.
     *
     * @param basicCharges The new basic charges for healthcare services.
     */
    public void setBasicCharges(double basicCharges) {
        this.basicCharges = basicCharges;
    }

    /**
     * Gets the additional charges for extra services.
     *
     * @return The additional charges for extra services.
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * Sets the additional charges for extra services.
     *
     * @param additionalCharges The new additional charges for extra services.
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     * Gets the charges for medications.
     *
     * @return The charges for medications.
     */
    public double getMedicationCharges() {
        return medicationCharges;
    }

    /**
     * Sets the charges for medications.
     *
     * @param medicationCharges The new charges for medications.
     */
    public void setMedicationCharges(double medicationCharges) {
        this.medicationCharges = medicationCharges;
    }

    /**
     * Gets the charges for room accommodations.
     *
     * @return The charges for room accommodations.
     */
    public double getRoomCharges() {
        return roomCharges;
    }

    /**
     * Sets the charges for room accommodations.
     *
     * @param roomCharges The new charges for room accommodations.
     */
    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    /**
     * Gets the charges for doctor's fees.
     *
     * @return The charges for doctor's fees.
     */
    public double getDoctorFees() {
        return doctorFees;
    }

    /**
     * Sets the charges for doctor's fees.
     *
     * @param doctorFees The new charges for doctor's fees.
     */
    public void setDoctorFees(double doctorFees) {
        this.doctorFees = doctorFees;
    }

    /**
     * Gets the total charges for the bill.
     *
     * @return The total charges for the bill.
     */
    public double getTotalCharges() {
        return totalCharges;
    }

    /**
     * Sets the total charges for the bill.
     *
     * @param totalCharges The new total charges for the bill.
     */
    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    /**
     * Gets the identifier of the associated patient.
     *
     * @return The identifier of the associated patient.
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * Sets the identifier of the associated patient.
     *
     * @param patientId The new identifier of the associated patient.
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     * Overrides the default toString method to provide a string representation of the Bill object.
     *
     * @return A string representation of the Bill object.
     */
    @Override
    public String toString() {
        return "Bill{" +
                "bId=" + bId +
                ", basicCharges=" + basicCharges +
                ", additionalCharges=" + additionalCharges +
                ", medicationCharges=" + medicationCharges +
                ", roomCharges=" + roomCharges +
                ", doctorFees=" + doctorFees +
                ", totalCharges=" + totalCharges +
                ", patientId=" + patientId +
                '}';
    }
}
