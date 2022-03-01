package DAO;

import Entities.Patient;
import Entities.Purpose;
import Util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PurposeDAO {

    public Purpose findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Purpose.class, id);
    }

    public void save(Purpose purpose) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(purpose);
        tx1.commit();
        session.close();
    }

    public void update(Purpose purpose) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(purpose);
        tx1.commit();
        session.close();
    }

    public void delete(Purpose purpose) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(purpose);
        tx1.commit();
        session.close();
    }
}
