package com.ensim.info.TP1.utils;


import com.ensim.info.TP1.exception.LimiteVisiteurException;
import com.ensim.info.TP1.zoo.IZooService;
import com.ensim.info.TP1.zoo.ZooService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringJava {

    public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IZooService zooService = (IZooService) context.getBean(IZooService.class);

        System.out.println("Ceci est le deuxième zoo");
        try {
            for(int i = 0 ; i < 10 ; i ++)
                zooService.nouveauVisiteur();
        } catch (LimiteVisiteurException e) {
            throw new RuntimeException(e);
        }
        System.out.println(zooService.getVisiteurs());


    }
}
