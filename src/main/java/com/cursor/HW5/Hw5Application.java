package com.cursor.HW5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Hw5Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext apc = SpringApplication.run(Hw5Application.class, args);

        for (String s : apc.getBeanDefinitionNames()) {
            System.out.println(s);
        }

        var firstBean = apc.getBean("firstUser");
        System.out.println("*******----------" + firstBean.toString() + "-------------************");
    }

}
