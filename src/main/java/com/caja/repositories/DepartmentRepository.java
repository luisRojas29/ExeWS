package com.caja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caja.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

}
