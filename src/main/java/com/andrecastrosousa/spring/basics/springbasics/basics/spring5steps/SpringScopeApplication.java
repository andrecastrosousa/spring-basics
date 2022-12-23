package com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps;

import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringScopeApplication.class)) {

            PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
            PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDAO);
            LOGGER.info("{}", personDAO.getJdbcConnection());

            LOGGER.info("{}", personDAO2);
            LOGGER.info("{}", personDAO2.getJdbcConnection());
        }

    }

}
