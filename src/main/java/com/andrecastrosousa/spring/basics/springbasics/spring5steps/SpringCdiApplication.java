package com.andrecastrosousa.spring.basics.springbasics.spring5steps;

import com.andrecastrosousa.spring.basics.springbasics.spring5steps.cdi.SomeCdiBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringCdiApplication {

    public static void main(String[] args) {

        // Application Context
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCdiApplication.class)) {

            SomeCdiBusiness someCDIBusiness = applicationContext.getBean(SomeCdiBusiness.class);

            System.out.println(someCDIBusiness.getsomeCdiDao());

        }
    }

}
