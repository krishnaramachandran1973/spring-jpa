package com.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.config.JpaConfig;
import com.cts.services.EmployeeService;

public class EmployeeTest {
	private static final Logger log = LoggerFactory.getLogger(EmployeeTest.class);

	public static void main(String[] args) {
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("app-context.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		EmployeeService empService = ctx.getBean("employeeService", EmployeeService.class);
		//empService.createEmployee("Rohit", 1000l, "Joined as PL");

		// empService.raiseSalary(1L, 8000L);
		//empService.findEmployeesByName("Rohit").forEach(emp -> log.info("{}", emp));

		empService.getEmployeeWithSimilarComments("Joined").forEach(emp -> log.info("{}", emp));

	}

}
