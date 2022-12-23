package com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps;


import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPropertiesApplication.class)) {
            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

            System.out.println(service.getServiceUrl());
        }
    }
}
