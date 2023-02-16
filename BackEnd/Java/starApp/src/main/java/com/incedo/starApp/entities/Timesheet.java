package com.incedo.starApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Timesheet")
public class Timesheet {
	@Id
	int timesheet_Id;
	String startDate;
	String endDate;
	int Hours;
	int Approval;
	@ManyToOne
    Project project ;
	@ManyToOne
    Employee employee ;
	Timesheet(){
		
	}
	public int getTimesheet_Id() {
		return timesheet_Id;
	}
	public void setTimesheet_Id(int timesheet_Id) {
		this.timesheet_Id = timesheet_Id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getHours() {
		return Hours;
	}
	public void setHours(int hours) {
		Hours = hours;
	}
	public int getApproval() {
		return Approval;
	}
	public void setApproval(int approval) {
		Approval = approval;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Timesheet(int timesheet_Id, String startDate, String endDate, int hours, int approval, Project project,
			Employee employee) {
		super();
		this.timesheet_Id = timesheet_Id;
		this.startDate = startDate;
		this.endDate = endDate;
		Hours = hours;
		Approval = approval;
		this.project = project;
		this.employee = employee;
	}
	
}
