package com.tschool.Util;

import com.tschool.Entities.Event;
import com.tschool.Entities.Medicament;
import com.tschool.Entities.Patient;
import com.tschool.Entities.Purpose;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Event.class);
                configuration.addAnnotatedClass(Medicament.class);
                configuration.addAnnotatedClass(Patient.class);
                configuration.addAnnotatedClass(Purpose.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return sessionFactory;
    }
}