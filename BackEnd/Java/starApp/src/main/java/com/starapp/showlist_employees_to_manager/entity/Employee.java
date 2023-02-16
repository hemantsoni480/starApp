package com.starapp.showlist_employees_to_manager.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
public class Employee {
	@Id
	int Employeeid;
	String Employeename;
	String Email;
	String Password;
	String Role;
	
	Employee(){
		
	}
	
	public Employee(int employeeid, String employeename, String email, String password, String role,
			List<Project> projects) {
		super();
		Employeeid = employeeid;
		Employeename = employeename;
		Email = email;
		Password = password;
		Role = role;
		
	}

	public int getEmployee_id() {
		return Employeeid;
	}
	public void setEmployee_id(int employeeid) {
		Employeeid = employeeid;
	}
	public String getEmployee_name() {
		return Employeename;
	}
	public void setEmployee_name(String employeeName) {
		Employeename = employeeName;
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