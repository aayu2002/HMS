package com.hospital.main;

import com.hospital.manage.*;
import com.hospital.service.*;

import java.util.Scanner;

public class HospitalManagementSystem {
    private static ManagePatient mpat = new ManagePatient();
    private static ManageDoctor mdoc = new ManageDoctor();
    private static ManageStaff mstaff = new ManageStaff();
    private static ManageBill mbill = new ManageBill();
    private static ManagePayment mpay = new ManagePayment();


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
                System.out.println("---------------------------");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    mpat.patientMenu(scanner);
                    break;
                case 2:
                    mdoc.doctorMenu(scanner);
                    break;
                case 3:
                    mstaff.staffMenu(scanner);
                    break;
                case 4:
                    mbill.billMenu(scanner);
                    break;
                case 5:
                    mpay.paymentMenu(scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Hospital Management System...");
                    System.out.println("---------------------------");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("---------------------------");
            }
        }
    }



}
