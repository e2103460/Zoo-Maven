package com.ensim.info.TP1;

import com.ensim.info.TP1.exception.LimiteVisiteurException;
import com.ensim.info.TP1.utils.TypeAnimal;
import com.ensim.info.TP1.zoo.Chien;
import com.ensim.info.TP1.zoo.IZooService;
import com.ensim.info.TP1.zoo.ZooDao;
import com.ensim.info.TP1.zoo.ZooService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Tp1Application {


	public static void main(String[] args) {
//		SpringApplication.run(Tp1Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");


		IZooService zooService = (IZooService) context.getBean("ZooService");
		System.out.println("Ceci est le premier zoo");


		try {
			for(int i = 0 ; i < 10 ; i ++)
			zooService.nouveauVisiteur();
		} catch (LimiteVisiteurException e) {
			throw new RuntimeException(e);
		}
		System.out.println(zooService.getVisiteurs());
	}

}
