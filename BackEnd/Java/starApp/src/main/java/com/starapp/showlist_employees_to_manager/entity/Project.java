package com.starapp.showlist_employees_to_manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Project {
	@Id
	String Projectid;
	String projectName;
	String projectDescription;
	  
	   @ManyToOne
	   @JsonManagedReference
	   @JoinColumn(name="Employeeid")
	   Employee employee;
	Project(){ 
		
	}   
	
	public Project(String projectid, String projectName, String projectDescription, Employee employee) {
		super();
		Projectid = projectid;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.employee = employee;
	}

	public String getProject_id() {
		return Projectid;
	}
	public void setProject_id(String projectid) {
		Projectid = projectid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	   
	
}
