package HibernatePractice;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class findAllStudent {
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	String query="select s from Student s";
	Query query2 = session.createQuery(query);
	List<Student>resultList = query2.getResultList();
	for(Student s: resultList)
	{
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPhone());
		System.out.println(s.getEmail());
		System.out.println(s.getPassword());
		System.out.println("____________");
	}
}
}
