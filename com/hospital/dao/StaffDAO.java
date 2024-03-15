package com.hospital.dao;

import com.hospital.entity.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StaffDAO {
    private SessionFactory sessionFactory;

    // Constructor to initialize Hibernate session factory
    public StaffDAO() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Staff.class)
                .buildSessionFactory();
    }

    // Method to add a new staff member
    public void addStaff(Staff staff) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(staff);
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

    // Method to update an existing staff member
    public void updateStaff(Staff staff) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(staff);
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

    // Method to delete a staff member by ID
    public void deleteStaff(String staffId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Staff staff = session.get(Staff.class, staffId);
            if (staff != null) {
                session.delete(staff);
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

    // Method to get a staff member by ID
    public Staff getStaffById(String staffId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Staff staff = null;

        try {
            transaction = session.beginTransaction();
            staff = session.get(Staff.class, staffId);
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

        return staff;
    }
}
