package com.caja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caja.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
