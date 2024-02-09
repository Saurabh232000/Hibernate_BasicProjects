package HibernatePractice;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateStudent {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter Student Id To update");
		s.setId(sc.nextInt());
		System.out.println("Enter Name:");
		s.setName(sc.next());
		System.out.println("Enter Phone:");
		s.setPhone(sc.nextLong());
		System.out.println("Enter Email:");
		s.setEmail(sc.next());
		System.out.println("Enter Password:");
		s.setPassword(sc.next());
		session.saveOrUpdate(s);
		tx.commit();
	}
}
