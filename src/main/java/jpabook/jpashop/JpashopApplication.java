package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jpabook.jpashop.domin.Member;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		// getter setter test
		HelloTest hello = new HelloTest();
		hello.setData("hello");
		String data = hello.getData();
		System.out.println(data);
		 
		SpringApplication.run(JpashopApplication.class, args);
	}

}
