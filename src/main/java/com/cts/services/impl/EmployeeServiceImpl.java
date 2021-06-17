package com.cts.services.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.entities.Address;
import com.cts.entities.Employee;
import com.cts.repo.EmployeeRepository;
import com.cts.services.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@PersistenceContext
	private EntityManager em;

	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee createEmployee(String name, Long salary, String comments, Address address) {
		logger.info("Creating an employee");
		Employee emp = Employee.builder().name(name).salary(salary).comments(comments).address(address).build();

		return repo.save(emp);
	}

	@Override
	public Employee findEmployee(Long id) {
		// em.find(entityClass, primaryKey) // PC here // propagated PC
		// dept.getDepartment(){
		// em.find()
		return null;
	}

	@Override
	public void removeEmployee(Long id) {
		repo.findById(id).ifPresent(emp -> repo.delete(emp));

	}

	@Override
	public Employee raiseSalary(Long id, Long raise) {
		Optional<Employee> emp = repo.findById(id);
		emp.ifPresent(emp1 -> emp1.setSalary(emp1.getSalary() + raise));
		return emp.get();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return repo.findAll();
	}

	@Override
	public List<Employee> findEmployeesByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<Employee> getEmployeeWithSimilarComments(String comment) {
		return repo.findByCustomQuery(comment);
	}

}
