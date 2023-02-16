package com.starapp.showlist_employees_to_manager.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starapp.showlist_employees_to_manager.entity.Employee;
import com.starapp.showlist_employees_to_manager.entity.Project;

public interface EmployeeRepository extends JpaRepository<Project,String>{
	@Query("SELECT c.Projectid from Project c ")
	List<String> findAllUsers();
	
List<Project> findProjectByprojectName(String projectName);

@Query("SELECT c.Projectid from Project c where c.employee.Employeeid=?1 ")
List<String> findAllProject(int Employeeid);

@Query("select t.timesheetId from Timesheet t where t.project.Projectid in(SELECT c.Projectid from Project c where c.employee.Employeeid=?1) ")
List<String> findAllTimesheet(int Employeeid);

}



