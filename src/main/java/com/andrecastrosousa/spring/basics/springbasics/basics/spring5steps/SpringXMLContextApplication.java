package com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps;

import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLContextApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringXMLContextApplication.class);

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            LOGGER.info("{}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);


            LOGGER.info(xmlPersonDAO.getXmlJdbcConnection().toString());
        }

    }
}
