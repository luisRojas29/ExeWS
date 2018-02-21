package com.caja.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.caja.entities.Employee;

@Service
public interface EmployeeService
{
	Employee createEmployee(Employee employee);
	
	List<Employee> findAll();
	
	Employee findById(int id);
}
