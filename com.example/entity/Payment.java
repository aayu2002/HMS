package com.example.entity;
/**
 * Represents a Payment in a hospital management system.
 * The Payment class stores information about a payment made for a bill.
 */
public class Payment {
    private int pId;            // Unique identifier for the payment
    private int billId;         // Identifier of the associated bill
    private String paymentMethod; // Payment method used for the transaction
    private double amount;       // Amount paid for the bill

    /**
     * Gets the unique identifier of the payment.
     *
     * @return The payment's unique identifier.
     */
    public int getpId() {
        return pId;
    }

    /**
     * Sets the unique identifier of the payment.
     *
     * @param pId The new unique identifier for the payment.
     */
    public void setpId(int pId) {
        this.pId = pId;
    }

    /**
     * Gets the identifier of the associated bill.
     *
     * @return The identifier of the associated bill.
     */
    public int getBillId() {
        return billId;
    }

    /**
     * Sets the identifier of the associated bill.
     *
     * @param billId The new identifier of the associated bill.
     */
    public void setBillId(int billId) {
        this.billId = billId;
    }

    /**
     * Gets the payment method used for the transaction.
     *
     * @return The payment method used for the transaction.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the payment method used for the transaction.
     *
     * @param paymentMethod The new payment method used for the transaction.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets the amount paid for the bill.
     *
     * @return The amount paid for the bill.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the amount paid for the bill.
     *
     * @param amount The new amount paid for the bill.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Overrides the default toString method to provide a string representation of the Payment object.
     *
     * @return A string representation of the Payment object.
     */
    @Override
    public String toString() {
        return "Payment{" +
                "pId=" + pId +
                ", billId=" + billId +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
