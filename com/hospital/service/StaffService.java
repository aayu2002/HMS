package com.hospital.service;

import com.hospital.dao.StaffDAO;
import com.hospital.entity.Staff;

import java.util.List;
import java.util.Scanner;

public class StaffService {

    private static StaffDAO staffDao = new StaffDAO();

    // Method to add a new staff member
    public static void addStaff(Scanner scanner) {
        System.out.print("Enter staff ID: ");
        String staffId = scanner.next();
        System.out.print("Enter staff first name: ");
        String fname = scanner.next();
        System.out.print("Enter staff last name: ");
        String lname = scanner.next();
        System.out.print("Enter staff gender: ");
        String gender = scanner.next();
        System.out.print("Enter staff designation: ");
        String designation = scanner.next();
        System.out.print("Enter staff age: ");
        int age = scanner.nextInt();
        System.out.print("Enter staff salary: ");
        double salary = scanner.nextDouble();

        // Create a new Staff object
        Staff staff = new Staff(staffId, fname, lname, gender, designation, age, salary);
        // Add staff member using StaffDAO
        staffDao.addStaff(staff);
    }

    // Method to update an existing staff member
    public static void updateStaff(Scanner scanner) {
        System.out.print("Enter staff ID to update: ");
        String staffId = scanner.next();
        Staff staff = staffDao.getStaffById(staffId);

        // If staff member found, update details
        if (staff != null) {
            System.out.print("Enter new staff first name: ");
            String fname = scanner.next();
            System.out.print("Enter new staff last name: ");
            String lname = scanner.next();
            System.out.print("Enter new staff gender: ");
            String gender = scanner.next();
            System.out.print("Enter new staff designation: ");
            String designation = scanner.next();
            System.out.print("Enter new staff age: ");
            int age = scanner.nextInt();
            System.out.print("Enter new staff salary: ");
            double salary = scanner.nextDouble();

            // Update staff member details
            staff.setFirstName(fname);
            staff.setLastName(lname);
            staff.setGender(gender);
            staff.setDesignation(designation);
            staff.setAge(age);
            staff.setSalary(salary);

            // Update staff member using StaffDAO
            staffDao.updateStaff(staff);
            System.out.println("---------------------------");
        } else {
            System.out.println("Staff not found.");
            System.out.println("---------------------------");
        }
    }

    // Method to delete a staff member
    public static void deleteStaff(Scanner scanner) {
        System.out.print("Enter staff ID to delete: ");
        String staffId = scanner.next();
        staffDao.deleteStaff(staffId);
        System.out.println("---------------------------");
    }

    // Method to view staff member details
    public static void viewStaffDetails(Scanner scanner) {
        System.out.print("Enter staff ID to view details: ");
        String staffId = scanner.next();
        Staff staff = staffDao.getStaffById(staffId);
        System.out.println("---------------------------");

        // If staff member found, display details
        if (staff != null) {
            System.out.println(staff);
        } else {
            System.out.println("Staff not found.");
            System.out.println("---------------------------");
        }
    }
    public static void getAllStaffs() {
        List<Staff> staff = staffDao.getAllStaffs();
        if (staff.isEmpty()) {
            System.out.println("No staff found.");
        } else {
            System.out.println("All Staff Details:");
            for (Staff s : staff) {
                System.out.println(s);
            }
        }
        System.out.println("---------------------------");
    }
}
