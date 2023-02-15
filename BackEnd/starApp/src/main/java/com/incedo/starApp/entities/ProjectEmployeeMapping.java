package com.incedo.starApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="project_Employee_Mapping")
public class ProjectEmployeeMapping {
	@Id
	int Id;
	@ManyToOne
    Employee employee;
	@ManyToOne
    Project project ;
	 int Allocation;
	 ProjectEmployeeMapping(){
		 
	 }
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getAllocation() {
		return Allocation;
	}
	public void setAllocation(int allocation) {
		Allocation = allocation;
	}
	public ProjectEmployeeMapping(int id, Employee employee, Project project, int allocation) {
		super();
		Id = id;
		this.employee = employee;
		this.project = project;
		Allocation = allocation;
	}
	 
}
