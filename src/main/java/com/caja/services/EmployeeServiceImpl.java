package com.caja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caja.entities.Employee;
import com.caja.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}
	
	@Override
	public Employee findById(int id) {
		return employeeRepo.getOne(id);
	}

}
