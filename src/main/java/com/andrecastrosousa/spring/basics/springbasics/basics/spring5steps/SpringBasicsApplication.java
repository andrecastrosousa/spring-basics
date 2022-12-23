package com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps;

import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.andrecastrosousa.spring.basics.springbasics.spring5steps")
public class SpringBasicsApplication {

	public static void main(String[] args) {

		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class)) {

			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

			System.out.println(result);

		}
	}

}
