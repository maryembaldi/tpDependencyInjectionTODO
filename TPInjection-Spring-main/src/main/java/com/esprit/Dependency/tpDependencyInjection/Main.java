package com.esprit.Dependency.tpDependencyInjection;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.esprit.Dependency.tpDependencyInjection.controller.ToDoController;


@Configuration
@ComponentScan
@EnableCaching(proxyTargetClass = true)
public class Main {

	public static void main(String[] args) {
	try (AnnotationConfigApplicationContext applicationContext = 
			new AnnotationConfigApplicationContext(
			Main.class)) {

		ToDoController toDoController = 
				applicationContext.getBean(ToDoController.class);
		System.out.println(toDoController.getCoursesList());



	}
}
}
