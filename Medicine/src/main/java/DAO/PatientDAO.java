package DAO;

import Entities.Patient;
import Util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PatientDAO {

    public Patient findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Patient.class, id);
    }

    public void save(Patient patient) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(patient);
        tx1.commit();
        session.close();
    }

    public void update(Patient patient) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(patient);
        tx1.commit();
        session.close();
    }

    public void delete(Patient patient) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(patient);
        tx1.commit();
        session.close();
    }

}