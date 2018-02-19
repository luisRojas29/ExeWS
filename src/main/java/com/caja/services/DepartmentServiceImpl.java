package com.caja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.caja.entities.Department;
import com.caja.repositories.DepartmentRepository;

public class DepartmentServiceImpl implements DepartmentService
{
	@Autowired
	private DepartmentRepository departmentRepo;

	@Override
	public List<Department> findAll() {
		return departmentRepo.findAll();
	}

}
