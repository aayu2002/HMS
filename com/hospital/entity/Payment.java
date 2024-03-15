package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    private String paymentId; // Payment ID

    private String billId; // Bill ID
    private String paymentMethod; // Payment method
    private double amount; // Amount

    // Default constructor
    public Payment() {}

    // Parameterized constructor
    public Payment(String paymentId, String billId, String paymentMethod, double amount) {
        this.paymentId = paymentId;
        this.billId = billId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    // Getters and Setters

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // toString method to represent Payment object as a string
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", billId='" + billId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
