package com.hospital.dao;

import com.hospital.entity.Bill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BillDAO {
    private SessionFactory sessionFactory;

    // Constructor to initialize Hibernate session factory
    public BillDAO() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Bill.class)
                .buildSessionFactory();
    }

    // Method to add a new bill
    public void addBill(Bill bill) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(bill);
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

    // Method to update an existing bill
    public void updateBill(Bill bill) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(bill);
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

    // Method to delete a bill by ID
    public void deleteBill(String billId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Bill bill = session.get(Bill.class, billId);
            if (bill != null) {
                session.delete(bill);
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

    // Method to get a bill by ID
    public Bill getBillById(String billId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Bill bill = null;

        try {
            transaction = session.beginTransaction();
            bill = session.get(Bill.class, billId);
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

        return bill;
    }
}
