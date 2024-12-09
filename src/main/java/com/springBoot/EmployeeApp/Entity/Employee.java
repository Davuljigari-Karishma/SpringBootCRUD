package com.springBoot.EmployeeApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name = "empid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empid;
	@Column(name = "empname")
	String empname;
	@Column(name = "email")
	String email;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int empid, String empname, String email) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
	}
	public Employee(String empname, String email) {
		super();
		this.empname = empname;
		this.email = email;
	}
	public Employee() {
		super();
	}
	
	
}
