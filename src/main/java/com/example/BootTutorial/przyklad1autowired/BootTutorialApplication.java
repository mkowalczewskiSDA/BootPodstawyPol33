package com.example.BootTutorial.przyklad1autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootTutorialApplication implements CommandLineRunner {

	@Autowired
	HelloWorld helloWorld;

	public static void main(String[] args) {
		SpringApplication.run(BootTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloWorld.getMessage();
		helloWorld.anotherBean.anotherMessage();
		helloWorld.yetAnotherBean.yetAnotherMessage();
	}
}
