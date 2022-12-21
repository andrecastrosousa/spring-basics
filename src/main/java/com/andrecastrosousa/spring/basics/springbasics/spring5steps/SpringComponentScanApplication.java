package com.andrecastrosousa.spring.basics.springbasics.spring5steps;

import com.andrecastrosousa.spring.basics.springbasics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.andrecastrosousa.spring.basics.springbasics.componentscan")
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);


    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanApplication.class)) {

            ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

            LOGGER.info("{}", componentDAO);
            LOGGER.info("{}", componentDAO.getJdbcConnection());

        }
    }
}
