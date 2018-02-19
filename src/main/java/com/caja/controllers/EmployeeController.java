package com.caja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caja.entities.Employee;
import com.caja.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{

	private List<Employee> employees = null;
	
	@Autowired
	private EmployeeService employeeServ;
	
	@RequestMapping( method = RequestMethod.GET )
	//private ResponseEntity<?> getAll(){
	private List<Employee> getAll(){
		
		employees = employeeServ.findAll();
		
		return employees;
	}
	
}
