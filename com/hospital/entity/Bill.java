package com.hospital.entity;

import javax.persistence.*;

@Entity
public class Bill {
    @Id
    @Column(name = "billId")
    private String billId;

    private double basicCharges;
    private double additionalCharges;
    private double medicationCharges;
    private double roomCharges;
    private double doctorFees;
    private double totalCharges;


    @OneToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;


    // Constructors, Getters, and Setters

    public Bill() {
    }

    public Bill(String billId, double basicCharges, double additionalCharges, double medicationCharges, double roomCharges, double doctorFees, double totalCharges) {
        this.billId = billId;
        this.basicCharges = basicCharges;
        this.additionalCharges = additionalCharges;
        this.medicationCharges = medicationCharges;
        this.roomCharges = roomCharges;
        this.doctorFees = doctorFees;
        this.totalCharges = totalCharges;
    }

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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
// Getters and Setters (omitted for brevity)

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
                '}';
    }
}
