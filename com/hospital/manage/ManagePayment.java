package com.hospital.manage;

import com.hospital.service.PaymentService;

import java.util.Scanner;

public class ManagePayment {
    private static PaymentService paymentService = new PaymentService();
    // Method to manage payment operations
    public static void paymentMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Payment Menu");
            System.out.println("---------------------------");
            System.out.println("1. Add Payment");
            System.out.println("2. Update Payment");
            System.out.println("3. Delete Payment");
            System.out.println("4. View Payment Details By ID");
            System.out.println("5. View  All Payment Details ");
            System.out.println("6. Back to Main Menu");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    paymentService.addPayment(scanner);
                    break;
                case 2:
                    paymentService.updatePayment(scanner);
                    break;
                case 3:
                    paymentService.deletePayment(scanner);
                    break;
                case 4:
                    paymentService.viewPaymentDetails(scanner);
                    break;
                case 5:
                    paymentService.getAllPayments();
                    break;
                case 6:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
