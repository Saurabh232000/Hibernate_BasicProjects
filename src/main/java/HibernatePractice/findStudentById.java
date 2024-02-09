package HibernatePractice;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class findStudentById {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id to Fetch:");
		int id = sc.nextInt();
		Student find = session.find(Student.class, id);
		if (find != null) {
			System.out.println(find.getId());
			System.out.println(find.getName());
			System.out.println(find.getPhone());
			System.out.println(find.getEmail());
			System.out.println(find.getPassword());
		} else {
			System.err.println(" Invalid Student Id");
		}
	}
}
