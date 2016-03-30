package org.stomper.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan(basePackages = "org.stomper.businesslogic.entity")
public class Application {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        String[] beanNames = ctx.getBeanDefinitionNames();
        System.out.println("Beans found: " + beanNames.length);
        System.out.println("Stomper is now running");
    }

}
