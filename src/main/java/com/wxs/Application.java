package com.wxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        String[] beanDefinitionNames;
        try (ConfigurableApplicationContext run = SpringApplication.run(Application.class, args)) {
            beanDefinitionNames = run.getBeanDefinitionNames();
        }
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }


    }
}