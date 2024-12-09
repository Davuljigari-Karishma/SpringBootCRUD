package com.springBoot.EmployeeApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.EmployeeApp.Entity.Employee;
import com.springBoot.EmployeeApp.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService es;

	@GetMapping("/emp")
	List<Employee> getAllEmp() {
		return es.getAll();
	}
	
	@GetMapping("/emp/{empid}")
	Employee getOneEmp(@PathVariable("empid") int id) {
		return es.getOnId(id);
	}
	
//	@PostMapping("/insertEmp")
    @PostMapping(value = "/emp", consumes = "application/json", produces = "application/json")

	public String insertEmp(@RequestBody Employee e) {
			return es.send(e);
	}
    
    @PutMapping("/emp/{empid}") 
    public String updateEmp(@PathVariable("empid") int id,@RequestBody Employee e) {
    	return es.update(id,e);
    }
    
    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") int id) {
    	return es.delete(id);
    }
}
