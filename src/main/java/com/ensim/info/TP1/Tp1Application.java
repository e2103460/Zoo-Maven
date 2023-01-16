package com.ensim.info.TP1;

import com.ensim.info.TP1.zoo.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1Application {

	private Zoo zoo;

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

}
