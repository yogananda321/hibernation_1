package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		person p2 = new person(33, "nandu", "VIGNAN", "6300395403");
		
	
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(p2);

		tx.commit();

		factory.close();
	}

}
