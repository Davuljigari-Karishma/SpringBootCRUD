package com.springBoot.EmployeeApp.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.springBoot.EmployeeApp.Entity.Employee;

@Component
public interface EmpRepo extends CrudRepository<Employee, Integer> {
	Employee findById(int id);
}
