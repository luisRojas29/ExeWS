package com.caja.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Transient;
import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "employees")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Validated
public class Employee
{
	private int id;
	
	@NotNull(message = "Es necesario ingresar un nombre de usuario")
	private String name;
	
	@NotNull(message = "Es necesario ingresar un apellido de usuario")
	private String lname;
	
	@Transient
	private Set<Department> departments;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
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

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	//@ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	//@JoinTable( name="employee_department", joinColumns= @JoinColumn(name = "employee_id", referencedColumnName="id"), inverseJoinColumns = @JoinColumn(name="department_id", referencedColumnName="id") )
	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	
	
}
