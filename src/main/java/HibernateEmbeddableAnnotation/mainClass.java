package HibernateEmbeddableAnnotation;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		// Creating Student Object--
		StudentDetail student1 = new StudentDetail();
		System.out.println(" Enter Student-1 name:");
		student1.setName(sc.next());
		student1.setDoj(new Date());
		// Creating Certificate Object--
		Certificate certificate1 = new Certificate();
		System.out.println("Enter Certificate courseName:");
		certificate1.setCourseName(sc.next());
		System.out.println("Enter Certificate courseDuration::");
		certificate1.setCourseDuration(sc.next());
		student1.setCerti(certificate1);
		s.save(student1);
		tx.commit();
	}
}
