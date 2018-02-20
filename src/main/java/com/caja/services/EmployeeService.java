package com.caja.services;

import java.util.List;

import com.caja.entities.Employee;

public interface EmployeeService
{
	Employee createEmployee(Employee employee);
	
	List<Employee> findAll();
	
	Employee findById(int id);
}
