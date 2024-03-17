package com.hospital.manage;

import com.hospital.service.StaffService;

import java.util.Scanner;

public class ManageStaff {
    // Method to manage staff operations
    private static StaffService staffService = new StaffService();
    public static void staffMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Staff Menu");
            System.out.println("---------------------------");
            System.out.println("1. Add Staff");
            System.out.println("2. Update Staff");
            System.out.println("3. Delete Staff");
            System.out.println("4. View Staff Details By ID");
            System.out.println("5. View  All Staff Details");
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
                    staffService.addStaff(scanner);
                    break;
                case 2:
                    staffService.updateStaff(scanner);
                    break;
                case 3:
                    staffService.deleteStaff(scanner);
                    break;
                case 4:
                    staffService.viewStaffDetails(scanner);
                    break;
                case 5:
                    staffService.getAllStaffs();
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
