package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
    @Id
    private String billId; // Bill ID

    private double basicCharges; // Basic charges
    private double additionalCharges; // Additional charges
    private double medicationCharges; // Medication charges
    private double roomCharges; // Room charges
    private double doctorFees; // Doctor fees
    private double totalCharges; // Total charges
    private String patientId; // Patient ID

    // Default constructor
    public Bill() {}

    // Parameterized constructor
    public Bill(String billId, double basicCharges, double additionalCharges, double medicationCharges, double roomCharges, double doctorFees, double totalCharges, String patientId) {
        this.billId = billId;
        this.basicCharges = basicCharges;
        this.additionalCharges = additionalCharges;
        this.medicationCharges = medicationCharges;
        this.roomCharges = roomCharges;
        this.doctorFees = doctorFees;
        this.totalCharges = totalCharges;
        this.patientId = patientId;
    }

    // Getters and Setters

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getBasicCharges() {
        return basicCharges;
    }

    public void setBasicCharges(double basicCharges) {
        this.basicCharges = basicCharges;
    }

    public double getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    public double getMedicationCharges() {
        return medicationCharges;
    }

    public void setMedicationCharges(double medicationCharges) {
        this.medicationCharges = medicationCharges;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public double getDoctorFees() {
        return doctorFees;
    }

    public void setDoctorFees(double doctorFees) {
        this.doctorFees = doctorFees;
    }

    public double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // toString method to represent Bill object as a string
    @Override
    public String toString() {
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", basicCharges=" + basicCharges +
                ", additionalCharges=" + additionalCharges +
                ", medicationCharges=" + medicationCharges +
                ", roomCharges=" + roomCharges +
                ", doctorFees=" + doctorFees +
                ", totalCharges=" + totalCharges +
                ", patientId='" + patientId + '\'' +
                '}';
    }
}
