package com.hospital.main;

import com.hospital.service.*;

import java.util.Scanner;

public class HospitalManagementSystem {

    private static PatientService patientService = new PatientService();
    private static DoctorService doctorService = new DoctorService();
    private static StaffService staffService = new StaffService();
    private static BillService billService = new BillService();
    private static PaymentService paymentService = new PaymentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Hospital Management System");
            System.out.println("---------------------------");
            System.out.println("1. Manage Patients");
            System.out.println("2. Manage Doctors");
            System.out.println("3. Manage Staff");
            System.out.println("4. Manage Bills");
            System.out.println("5. Manage Payments");
            System.out.println("6. Exit");

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
                    patientMenu(scanner);
                    break;
                case 2:
                    doctorMenu(scanner);
                    break;
                case 3:
                    staffMenu(scanner);
                    break;
                case 4:
                    billMenu(scanner);
                    break;
                case 5:
                    paymentMenu(scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Hospital Management System...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to manage patient operations
    private static void patientMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Patient Menu");
            System.out.println("---------------------------");
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. View Patient Details");
            System.out.println("5. Back to Main Menu");

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
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to manage doctor operations
    private static void doctorMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("---------------------------");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. View Doctor Details");
            System.out.println("5. Back to Main Menu");

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
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to manage staff operations
    private static void staffMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("---------------------------");
            System.out.println("1. Add Staff");
            System.out.println("2. Update Staff");
            System.out.println("3. Delete Staff");
            System.out.println("4. View Staff Details");
            System.out.println("5. Back to Main Menu");

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
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to manage bill operations
    private static void billMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("---------------------------");
            System.out.println("1. Add Bill");
            System.out.println("2. Update Bill");
            System.out.println("3. Delete Bill");
            System.out.println("4. View Bill Details");
            System.out.println("5. Back to Main Menu");

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
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to manage payment operations
    private static void paymentMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("---------------------------");
            System.out.println("1. Add Payment");
            System.out.println("2. Update Payment");
            System.out.println("3. Delete Payment");
            System.out.println("4. View Payment Details");
            System.out.println("5. Back to Main Menu");

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
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
