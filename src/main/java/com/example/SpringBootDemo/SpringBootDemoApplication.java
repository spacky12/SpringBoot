package com.example.SpringBootDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	Pulsar plsr;
	SpringBootDemoApplication(Pulsar plsr)
	{
		this.plsr=plsr;
	}
	@Override
	public void run(String... args) throws Exception {
		plsr.speed();
	}
}
