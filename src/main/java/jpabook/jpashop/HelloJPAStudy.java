package jpabook.jpashop;

import javax.persistence.Persistence;
import javax.persistence.*;

import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

public class HelloJPAStudy {

	public static void main(String[] args) {
		System.out.println("HELLO JPA STUDY");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

		System.out.println(emf);
	}
}
