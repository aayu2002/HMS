package com.hospital.manage;

import com.hospital.service.BillService;

import java.util.Scanner;

public class ManageBill {
    private static BillService billService = new BillService();

    // Method to manage bill operations
    public static void billMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Bill Menu");
            System.out.println("---------------------------");
            System.out.println("1. Add Bill");
            System.out.println("2. Update Bill");
            System.out.println("3. Delete Bill");
            System.out.println("4. View Bill Details by Id");
            System.out.println("5. View All Bills");
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
                    billService.addBill(scanner);
                    break;
                case 2:
                    billService.updateBill(scanner);
                    break;
                case 3:
                    billService.deleteBill(scanner);
                    break;
                case 4:
                    billService.viewBillDetails(scanner);
                    break;
                case 5:
                    billService.getAllBills();
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
