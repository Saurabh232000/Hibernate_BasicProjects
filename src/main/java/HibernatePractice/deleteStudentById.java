package HibernatePractice;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class deleteStudentById {
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id to Find First:");
		int id = sc.nextInt();
		Student find = s.find(Student.class, id);
		if (find != null) {
			s.remove(find);
			tx.commit();
			System.out.println(" One Record Deleted:");
		} else {
			System.err.println(" Invalid Student Id:");
		}
	}
}
