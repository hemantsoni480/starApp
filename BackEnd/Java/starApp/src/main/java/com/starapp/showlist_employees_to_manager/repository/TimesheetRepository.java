package com.starapp.showlist_employees_to_manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starapp.showlist_employees_to_manager.entity.Project;
import com.starapp.showlist_employees_to_manager.entity.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet,String>{
	@Query("select t from Timesheet t where t.project.Projectid in(SELECT c.Projectid from Project c where c.employee.Employeeid=?1) ")
	List<Timesheet> findAllTimesheet(int Employeeid);

     Timesheet findBytimesheetId(String timesheetid);
}
