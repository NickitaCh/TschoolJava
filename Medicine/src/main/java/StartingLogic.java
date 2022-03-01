

import Entities.Event;
import Entities.Medicament;
import Entities.Patient;
import Entities.Purpose;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class StartingLogic {
    public static void start() {
//        PatientService patientService = new PatientService();
//        Patient patient = new Patient("eytytj", "sdyjg", 12, "ety", "d");
//        PurposeService purposeService = new PurposeService();
//
//        patientService.savePatient(patient);
//        purposeService.savePurpose(purpose);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Patient.class).addAnnotatedClass(Purpose.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Patient patient = new Patient("eytytj", "sdyjg", 12, "ety", "d");
//            Purpose purpose1 = new Purpose("ser", "d64567hg", "djy", "e56es");
//            Purpose purpose2  = new Purpose("fsdg" , "d665477hg", "duytythjy", "e576846ues");
//            Event event1 = new Event(1, "dfh");
//            Event event2 = new Event(2, "dftrjh");
//            Medicament medicament1 = new Medicament("1", "dhfg");
//            Medicament medicament2 = new Medicament("2", "dhfg");
//            Medicament medicament3 = new Medicament("3", "dhfg");
//
//            patient.addPurposeToPatient(purpose1);
//            patient.addPurposeToPatient(purpose2);
//            patient.addEventToPatient(event1);
//            patient.addEventToPatient(event2);
//            purpose1.addMedicamentToPurpose(medicament1);
//            purpose1.addMedicamentToPurpose(medicament2);
//            purpose2.addMedicamentToPurpose(medicament3);
//
//
//
//
//            session.beginTransaction();
//            session.save(patient);
//
//            session.getTransaction().commit();
//            System.out.println("done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Patient patient = session.get(Patient.class, 37);
            session.delete(patient);

            session.getTransaction().commit();
            System.out.println("done!");

        } finally {
            session.close();
            factory.close();
        }
    }

}
