package com.hospital.manage;

import com.hospital.service.PatientService;

import java.util.Scanner;

public class ManagePatient {
    private static PatientService patientService = new PatientService();

    // Method to manage patient operations
    public static void patientMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Patient Menu");
            System.out.println("---------------------------");
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. View Patient Details ");
            System.out.println("5. View All Patient Details");
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
                    patientService.addPatient(scanner);
                    break;
                case 2:
                    patientService.updatePatient(scanner);
                    break;
                case 3:
                    patientService.deletePatient(scanner);
                    break;
                case 4:
                    patientService.viewPatientDetails(scanner);
                    break;
                case 5:
                    patientService.getAllPatients();
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
