package com.hospital.service;

import com.hospital.dao.PaymentDAO;
import com.hospital.dao.BillDAO;
import com.hospital.entity.Payment;
import com.hospital.entity.Bill;

import java.util.List;
import java.util.Scanner;

public class PaymentService {

    private static PaymentDAO paymentDao = new PaymentDAO();
    private static BillDAO billDao = new BillDAO();

    // Method to add a new payment
    public static void addPayment(Scanner scanner) {
        System.out.print("Enter payment ID: ");
        String paymentId = scanner.next();
        System.out.print("Enter bill ID: ");
        String billId = scanner.next();
        System.out.print("Enter payment method: ");
        String paymentMethod = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        // Retrieve bill information
        Bill bill = billDao.getBillById(billId);

        // If bill exists, create a new payment and add it
        if (bill != null) {
            Payment payment = new Payment(paymentId, paymentMethod, amount);
            paymentDao.addPayment(payment);
        } else {
            System.out.println("Bill not found.");
        }
    }

    // Method to update an existing payment
    public static void updatePayment(Scanner scanner) {
        System.out.print("Enter payment ID to update: ");
        String paymentId = scanner.next();
        Payment payment = paymentDao.getPaymentById(paymentId);

        // If payment found, update its details
        if (payment != null) {
            System.out.print("Enter new payment method: ");
            String paymentMethod = scanner.next();
            double amount = scanner.nextDouble();
            System.out.print("Amount  paid ");


            payment.setPaymentMethod(paymentMethod);
            payment.setAmount(amount);

            paymentDao.updatePayment(payment);
            System.out.println("---------------------------");
        } else {
            System.out.println("Payment not found.");
            System.out.println("---------------------------");
        }
    }

    // Method to delete a payment
    public static void deletePayment(Scanner scanner) {
        System.out.print("Enter payment ID to delete: ");
        String paymentId = scanner.next();
        paymentDao.deletePayment(paymentId);
    }

    // Method to view payment details
    public static void viewPaymentDetails(Scanner scanner) {
        System.out.print("Enter payment ID to view details: ");
        String paymentId = scanner.next();
        Payment payment = paymentDao.getPaymentById(paymentId);

        // If payment found, display its details
        if (payment != null) {
            System.out.println(payment);
            System.out.println("---------------------------");
        } else {
            System.out.println("Payment not found.");
            System.out.println("---------------------------");
        }
    }
    public static void getAllPayments() {
        List<Payment> payments = paymentDao.getAllPayments();
        if (payments.isEmpty()) {
            System.out.println("No payments found.");
        } else {
            System.out.println("All Payment Details:");
            for (Payment payment : payments) {
                System.out.println(payment);
            }
        }
        System.out.println("---------------------------");
    }
}
