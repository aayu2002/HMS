package com.hospital.dao;

import com.hospital.entity.Payment;
import com.hospital.entity.Bill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class PaymentDAO {
    private SessionFactory sessionFactory;

    public PaymentDAO() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Payment.class)
                .addAnnotatedClass(Bill.class)
                .buildSessionFactory();
    }

    public void addPayment(Payment payment, String billId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Retrieve the Bill object from the database or create a new one
            Bill bill = session.get(Bill.class, billId);
            if (bill == null) {
                // Create a new Bill object if it doesn't exist
                bill = new Bill();
                session.save(bill);
            }

            // Associate the Bill object with the Payment object
            payment.setBill(bill);

            // Save the Payment object
            session.save(payment);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }




    public void updatePayment(Payment payment) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(payment);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deletePayment(String paymentId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Payment payment = session.get(Payment.class, paymentId);
            if (payment != null) {
                session.delete(payment);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Payment getPaymentById(String paymentId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Payment payment = null;

        try {
            transaction = session.beginTransaction();
            payment = session.get(Payment.class, paymentId);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return payment;
    }
    public List<Payment> getAllPayments() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Payment> payments = null;

        try {
            transaction = session.beginTransaction();
            payments = session.createQuery("FROM Payment", Payment.class).getResultList();
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

        return payments;
    }
}
