package com.incedo.starApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	@Id
	int Project_id;
	String projectName;
	String projectDescription;
	   @ManyToOne
	    Employee employee;
	Project(){ 
		
	}   
	
	public Project(int project_id, String projectName, String projectDescription, Employee employee) {
		super();
		Project_id = project_id;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.employee = employee;
	}

	public int getProject_id() {
		return Project_id;
	}
	public void setProject_id(int project_id) {
		Project_id = project_id;
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
