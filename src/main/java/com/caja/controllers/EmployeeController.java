package com.caja.controllers;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.caja.entities.Employee;
import com.caja.services.EmployeeService;

@Path("/employees")
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
