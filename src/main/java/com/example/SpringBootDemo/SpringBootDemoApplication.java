package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	@Autowired
	Bike bike;
	@Override
	public void run(String... args) throws Exception {
		bike.speed();
	}
}
