package HibernatePractice;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class saveStudent {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println(sf);
//		System.out.println(sf.isOpen());
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		Transaction tx = session.beginTransaction();
		Student s = new Student();
		System.out.println("Enter Your Name:");
		s.setName(sc.next());
		System.out.println("Enter Your Phone:");
		s.setPhone(sc.nextLong());
		System.out.println("Enter Your Email:");
		s.setEmail(sc.next());
		System.out.println("Enter Your Password:");
		s.setPassword(sc.next());
		session.save(s);
		tx.commit();
	}
}
