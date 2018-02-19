package com.caja.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "companies")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Validated
public class Company
{
	private int id;
	
	private String name;
	
	private Set<Department> departments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	
	
}
