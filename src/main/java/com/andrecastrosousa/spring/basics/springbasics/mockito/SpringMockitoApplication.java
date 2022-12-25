package com.andrecastrosousa.spring.basics.springbasics.mockito;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.andrecastrosousa.spring.basics.springbasics")
public class SpringMockitoApplication {
    public static void main(String[] args) {

        // Application Context
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringMockitoApplication.class)) {

        }
    }
}
