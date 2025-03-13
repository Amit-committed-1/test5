package com.test5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test5Application {
        int x = 100;
	char ch = 'A';
	boolean isPresent = true;
	double d = 23.678;
	float f1 = 12.56f;
	boolean isSubscribed = false;
	public static void main(String[] args) {
		SpringApplication.run(Test5Application.class, args);
	}

}
