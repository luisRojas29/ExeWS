package com.caja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.caja.entities.Employee;
import com.caja.repositories.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

}
