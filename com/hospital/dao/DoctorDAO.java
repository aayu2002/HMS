package com.hospital.dao;

import com.hospital.entity.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DoctorDAO {
    private SessionFactory sessionFactory;

    // Constructor to initialize Hibernate session factory
    public DoctorDAO() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Doctor.class)
                .buildSessionFactory();
    }

    // Method to add a new doctor
    public void addDoctor(Doctor doctor) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(doctor);
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

    // Method to update an existing doctor
    public void updateDoctor(Doctor doctor) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(doctor);
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

    // Method to delete a doctor by ID
    public void deleteDoctor(String doctorId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Doctor doctor = session.get(Doctor.class, doctorId);
            if (doctor != null) {
                session.delete(doctor);
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

    // Method to get a doctor by ID
    public Doctor getDoctorById(String doctorId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Doctor doctor = null;

        try {
            transaction = session.beginTransaction();
            doctor = session.get(Doctor.class, doctorId);
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

        return doctor;
    }
}
