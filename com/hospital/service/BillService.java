package com.hospital.service;

import com.hospital.dao.BillDAO;
import com.hospital.dao.PatientDAO;
import com.hospital.entity.Bill;
import com.hospital.entity.Patient;

import java.util.List;
import java.util.Scanner;

public class BillService {

    private static final BillDAO billDao = new BillDAO();
    private static final PatientDAO patientDao = new PatientDAO();

    // Method to add a new bill
    public static void addBill(Scanner scanner) {
        System.out.print("Enter bill ID: ");
        String billId = scanner.next();
        System.out.print("Enter patient ID: ");
        String patientId = scanner.next();
        System.out.print("Enter basic charges: ");
        double basicCharges = scanner.nextDouble();
        System.out.print("Enter additional charges: ");
        double additionalCharges = scanner.nextDouble();
        System.out.print("Enter medication charges: ");
        double medicationCharges = scanner.nextDouble();
        System.out.print("Enter room charges: ");
        double roomCharges = scanner.nextDouble();
        System.out.print("Enter doctor fees: ");
        double doctorFees = scanner.nextDouble();
        double totalCharges = basicCharges + additionalCharges + medicationCharges + roomCharges + doctorFees;
        System.out.println("Total Charges: " + totalCharges);

        // Retrieve patient information
        Patient patient = patientDao.getPatientById(patientId);

        // If patient exists, create a new bill and add it
        if (patient != null) {
            Bill bill = new Bill(billId, basicCharges, additionalCharges, medicationCharges, roomCharges, doctorFees, totalCharges);
            billDao.addBill(bill);
            System.out.println("Bill added successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    // Method to update an existing bill
    public static void updateBill(Scanner scanner) {
        System.out.print("Enter bill ID to update: ");
        String billId = scanner.next();
        Bill bill = billDao.getBillById(billId);

        // If bill found, update its details
        if (bill != null) {
            System.out.print("Enter new basic charges: ");
            double basicCharges = scanner.nextDouble();
            System.out.print("Enter new additional charges: ");
            double additionalCharges = scanner.nextDouble();
            System.out.print("Enter new medication charges: ");
            double medicationCharges = scanner.nextDouble();
            System.out.print("Enter new room charges: ");
            double roomCharges = scanner.nextDouble();
            System.out.print("Enter new doctor fees: ");
            double doctorFees = scanner.nextDouble();
            double newTotalCharges = basicCharges + additionalCharges + medicationCharges + roomCharges + doctorFees;
            System.out.println("New Total Charges: " + newTotalCharges);

            // Update bill details
            bill.setBasicCharges(basicCharges);
            bill.setAdditionalCharges(additionalCharges);
            bill.setMedicationCharges(medicationCharges);
            bill.setRoomCharges(roomCharges);
            bill.setDoctorFees(doctorFees);
            bill.setTotalCharges(newTotalCharges);
            billDao.updateBill(bill);
            System.out.println("Bill updated successfully.");
        } else {
            System.out.println("Bill not found.");
        }
    }

    // Method to delete a bill
    public static void deleteBill(Scanner scanner) {
        System.out.print("Enter bill ID to delete: ");
        String billId = scanner.next();
        billDao.deleteBill(billId);
        System.out.println("Bill deleted successfully.");
    }

    // Method to view bill details
    public static void viewBillDetails(Scanner scanner) {
        System.out.print("Enter bill ID to view details: ");
        String billId = scanner.next();
        Bill bill = billDao.getBillById(billId);

        // If bill found, display its details
        if (bill != null) {
            System.out.println(bill);
        } else {
            System.out.println("Bill not found.");
        }
    }

    // Method to get all bills
    public static void getAllBills() {
        List<Bill> bills = billDao.getAllBills();
        if (bills.isEmpty()) {
            System.out.println("No bills found.");
        } else {
            System.out.println("All Bill Details:");
            for (Bill bill : bills) {
                System.out.println(bill);
            }
        }
    }
}
