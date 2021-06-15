package com.cts.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.entities.Employee;
import com.cts.services.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee createEmployee(String name, Long salary, String comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEmployee(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee raiseSalary(Long id, Long raise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
