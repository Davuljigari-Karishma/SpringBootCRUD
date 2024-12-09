package com.springBoot.EmployeeApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.EmployeeApp.Entity.Employee;
import com.springBoot.EmployeeApp.Repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo er;

	public List<Employee> getAll() {
		return (List<Employee>) er.findAll();
	}

	public Employee getOnId(int id) {
		Employee e = er.findById(id);
		return e;
	}

	public String send(Employee e) {
		er.save(e);
		return "Success";
		
	}

	public String update(int id, Employee e) {
		Employee e1=er.findById(id);
		e1.setEmpname(e.getEmpname());
		er.save(e1);
		return "Success";
	}

	public String delete(int id) {
		er.delete(getOnId(id));
		return "success";
		
	}
}
