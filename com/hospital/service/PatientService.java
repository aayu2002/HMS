package com.hospital.service;

import com.hospital.dao.PatientDAO;
import com.hospital.entity.Patient;

import java.util.List;
import java.util.Scanner;

public class PatientService {

    private static  PatientDAO patientDao = new PatientDAO();

    // Method to add a new patient
    public static void addPatient(Scanner scanner) {
        System.out.print("Enter patient ID: ");
        String patientId = scanner.next();
        System.out.print("Enter patient first name: ");
        String fname = scanner.next();
        System.out.print("Enter patient last name: ");
        String lname = scanner.next();
        System.out.print("Enter patient gender: ");
        String gender = scanner.next();
        System.out.print("Enter patient disease: ");
        String disease = scanner.next();
        System.out.print("Enter patient admit status: ");
        String admitStatus = scanner.next();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        System.out.print("Enter patient phone number: ");
        String phoneNo = scanner.next();

        // Create patient object
        Patient patient = new Patient(patientId, fname, lname, gender, disease, admitStatus, age, phoneNo);

        // Add patient using DAO
        patientDao.addPatient(patient);
    }

    // Method to update an existing patient
    public static void updatePatient(Scanner scanner) {
        System.out.print("Enter patient ID to update: ");
        String patientId = scanner.next();
        Patient patient = patientDao.getPatientById(patientId);

        // If patient found, update details
        if (patient != null) {
            System.out.print("Enter new patient first name: ");
            String fname = scanner.next();
            System.out.print("Enter new patient last name: ");
            String lname = scanner.next();
            System.out.print("Enter new patient gender: ");
            String gender = scanner.next();
            System.out.print("Enter new patient disease: ");
            String disease = scanner.next();
            System.out.print("Enter new patient admit status: ");
            String admitStatus = scanner.next();
            System.out.print("Enter new patient age: ");
            int age = scanner.nextInt();
            System.out.print("Enter new patient phone number: ");
            String phoneNo = scanner.next();

            // Update patient details
            patient.setFirstName(fname);
            patient.setLastName(lname);
            patient.setGender(gender);
            patient.setDisease(disease);
            patient.setAdmitStatus(admitStatus);
            patient.setAge(age);
            patient.setPhoneNumber(phoneNo);

            // Update patient using DAO
            patientDao.updatePatient(patient);
            System.out.println("---------------------------");
        } else {
            System.out.println("Patient not found.");
            System.out.println("---------------------------");
        }
    }

    // Method to delete a patient
    public static void deletePatient(Scanner scanner) {
        System.out.print("Enter patient ID to delete: ");
        String patientId = scanner.next();
        patientDao.deletePatient(patientId);
        System.out.println("---------------------------");
    }

    // Method to view patient details
    public static void viewPatientDetails(Scanner scanner) {
        System.out.print("Enter patient ID to view details: ");
        String patientId = scanner.next();
        Patient patient = patientDao.getPatientById(patientId);

        // If patient found, display details
        if (patient != null) {
            System.out.println(patient);
        } else {
            System.out.println("Patient not found.");
            System.out.println("---------------------------");
        }

    }

    // Method to get all patients
    public static void getAllPatients() {
        List<Patient> patients = patientDao.getAllPatients();
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            System.out.println("Patient Details:");
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
        System.out.println("---------------------------");
    }
}
