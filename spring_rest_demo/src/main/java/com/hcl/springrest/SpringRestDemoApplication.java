package com.hcl.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;

@SpringBootApplication
public class SpringRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDemoApplication.class, args);
	

		System.out.println("Updating main file");

		System.out.println("Hi Javeed , welcome back");

		System.out.println(LocalDate.now());

		System.out.println("Javeed sir updated project just now");
	}

}
