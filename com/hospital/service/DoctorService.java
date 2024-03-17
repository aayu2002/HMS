package com.hospital.service;

import com.hospital.dao.DoctorDAO;
import com.hospital.entity.Doctor;
import java.util.List;
import java.util.Scanner;

public class DoctorService {

    private static DoctorDAO doctorDao = new DoctorDAO();

    // Method to add a new doctor
    public static void addDoctor(Scanner scanner) {
        System.out.print("Enter doctor ID: ");
        String doctorId = scanner.next();
        System.out.print("Enter doctor name: ");
        String dname = scanner.next();
        System.out.print("Enter doctor qualification: ");
        String qualification = scanner.next();
        System.out.print("Enter doctor specialization: ");
        String specialization = scanner.next();
        System.out.print("Enter doctor availability: ");
        String availability = scanner.next();

        // Create a new Doctor object
        Doctor doctor = new Doctor(doctorId, dname, qualification, specialization, availability);
        // Add doctor using DoctorDAO
        doctorDao.addDoctor(doctor);
    }

    // Method to update an existing doctor
    public static void updateDoctor(Scanner scanner) {
        System.out.print("Enter doctor ID to update: ");
        String doctorId = scanner.next();
        Doctor doctor = doctorDao.getDoctorById(doctorId);
        System.out.println("---------------------------");

        // If doctor found, update details
        if (doctor != null) {
            System.out.print("Enter new doctor name: ");
            String dname = scanner.next();
            System.out.print("Enter new doctor qualification: ");
            String qualification = scanner.next();
            System.out.print("Enter new doctor specialization: ");
            String specialization = scanner.next();
            System.out.print("Enter new doctor availability: ");
            String availability = scanner.next();

            // Update doctor details
            doctor.setDoctorName(dname);
            doctor.setQualification(qualification);
            doctor.setSpecialization(specialization);
            doctor.setAvailability(availability);

            // Update doctor using DoctorDAO
            doctorDao.updateDoctor(doctor);
            System.out.println("---------------------------");
        } else {
            System.out.println("Doctor not found.");
        }
    }

    // Method to delete a doctor
    public static void deleteDoctor(Scanner scanner) {
        System.out.print("Enter doctor ID to delete: ");
        String doctorId = scanner.next();
        doctorDao.deleteDoctor(doctorId);
        System.out.println("---------------------------");
    }

    // Method to view doctor details
    public static void viewDoctorDetails(Scanner scanner) {
        System.out.print("Enter doctor ID to view details: ");
        String doctorId = scanner.next();
        Doctor doctor = doctorDao.getDoctorById(doctorId);

        // If doctor found, display details
        if (doctor != null) {
            System.out.println(doctor);
        } else {
            System.out.println("Doctor not found.");
        }
    }

    // Method to get all doctors
    public static void getAllDoctors() {
        List<Doctor> doctors = doctorDao.getAllDoctors();
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            System.out.println("Doctor Details:");
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
        System.out.println("---------------------------");
    }
}
