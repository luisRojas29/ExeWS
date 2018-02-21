package com.caja.resources;

import java.util.Collection;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caja.entities.Employee;
import com.caja.services.EmployeeService;

@Component
@Path("/employees")
@Produces("application/json")
public class EmployeeResource
{
	
	private Collection<Employee> employees = null;

	//@Inject
	@Autowired
	private EmployeeService employeeService;
	
	@POST
	public Employee createEmployee( Employee employee ) {
		return employeeService.createEmployee(employee);
	}
	
	@GET
	public Collection<Employee> getEmployees() throws NotFoundException {
	//public String getEmployees(){
		
		employees = employeeService.findAll();
		
		if( employees == null ) throw new NotFoundException();
		
		return employees;
		
		//return "Hola";
	}
	/*
	@Path("/{id}")
	@GET
	public Employee getEmployee(@PathParam("id") int id) throws NotFoundException {
		
		Employee employee = employeeService.findById(id);
		
		if( employees == null ) throw new NotFoundException();
		
		return employee;
	}*/
	
}
