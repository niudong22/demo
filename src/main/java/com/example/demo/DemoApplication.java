package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		try {
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
			throw new ArrayIndexOutOfBoundsException("xx");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
	}

}
