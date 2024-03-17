package com.hospital.manage;

import com.hospital.service.DoctorService;

import java.util.Scanner;

public class ManageDoctor {
    private static DoctorService doctorService = new DoctorService();
    // Method to manage doctor operations
    public static void doctorMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Doctor Menu");
            System.out.println("---------------------------");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. View Doctor Details By ID");
            System.out.println("5. View All Doctor Details ");
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
                    doctorService.addDoctor(scanner);
                    break;
                case 2:
                    doctorService.updateDoctor(scanner);
                    break;
                case 3:
                    doctorService.deleteDoctor(scanner);
                    break;
                case 4:
                    doctorService.viewDoctorDetails(scanner);
                    break;
                case 5:
                    doctorService.getAllDoctors();
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
