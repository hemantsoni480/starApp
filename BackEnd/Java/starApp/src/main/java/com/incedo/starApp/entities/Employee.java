package com.incedo.starApp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Employee_master")
public class Employee {
	@Id
	int Employee_id;
	String Employee_name;
	String Email;
	String Password;
	String Role;
	
	Employee(){
		
	}
	
	public Employee(int employee_id, String employee_name, String email, String password, String role,
			List<Project> projects) {
		super();
		Employee_id = employee_id;
		Employee_name = employee_name;
		Email = email;
		Password = password;
		Role = role;
		
	}

	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}

	

}