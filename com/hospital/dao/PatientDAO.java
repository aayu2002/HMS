package com.hospital.dao;

import com.hospital.entity.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PatientDAO {
    private SessionFactory sessionFactory;

    public PatientDAO() {
        // Initialize Hibernate session factory
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Patient.class)
                .buildSessionFactory();
    }

    // Method to add a new patient record
    public void addPatient(Patient patient) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(patient);
            transaction.commit();
        } catch (Exception e) {
            // Rollback transaction in case of exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session
            session.close();
        }
    }

    // Method to update an existing patient record
    public void updatePatient(Patient patient) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(patient);
            transaction.commit();
        } catch (Exception e) {
            // Rollback transaction in case of exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session
            session.close();
        }
    }

    // Method to delete a patient record by ID
    public void deletePatient(String patientId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Patient patient = session.get(Patient.class, patientId);
            if (patient != null) {
                session.delete(patient);
            }
            transaction.commit();
        } catch (Exception e) {
            // Rollback transaction in case of exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session
            session.close();
        }
    }

    // Method to get a patient record by ID
    public Patient getPatientById(String patientId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Patient patient = null;

        try {
            transaction = session.beginTransaction();
            patient = session.get(Patient.class, patientId);
            transaction.commit();
        } catch (Exception e) {
            // Rollback transaction in case of exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session
            session.close();
        }

        return patient;
    }
}
