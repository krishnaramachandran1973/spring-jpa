package com.cts.services;

import java.util.List;

import com.cts.entities.Address;
import com.cts.entities.Employee;

public interface EmployeeService {
	Employee createEmployee(String name, Long salary, String comments, Address address);

	Employee findEmployee(Long id);

	void removeEmployee(Long id);

	Employee raiseSalary(Long id, Long raise);

	List<Employee> findAllEmployees();
	
	List<Employee> findEmployeesByName(String name);
	
	List<Employee> getEmployeeWithSimilarComments(String comment);

}
