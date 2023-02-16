package com.starapp.showlist_employees_to_manager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Timesheet {
	@Id
	String timesheetId;
	String startDate;
	String endDate;
	int Hours;
	int Approval;
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name="Projectid")
    Project project ;
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name="Employeeid")
    Employee employee ;
	Timesheet(){
		
	}
	public String getTimesheet_Id() {
		return timesheetId;
	}
	public void setTimesheet_Id(String timesheetId) {
		this.timesheetId = timesheetId;
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
	public Timesheet(String timesheet_Id, String startDate, String endDate, int hours, int approval, Project project,
			Employee employee) {
		super();
		this.timesheetId = timesheetId;
		this.startDate = startDate;
		this.endDate = endDate;
		Hours = hours;
		Approval = approval;
		this.project = project;
		this.employee = employee;
	}
	
}
