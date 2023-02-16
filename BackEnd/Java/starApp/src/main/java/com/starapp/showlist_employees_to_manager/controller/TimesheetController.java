package com.starapp.showlist_employees_to_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.starapp.showlist_employees_to_manager.entity.Project;
import com.starapp.showlist_employees_to_manager.entity.Timesheet;
import com.starapp.showlist_employees_to_manager.repository.EmployeeRepository;
import com.starapp.showlist_employees_to_manager.repository.TimesheetRepository;

@RestController
public class TimesheetController {
	
	@Autowired
	TimesheetRepository timesheetRepository;

	@GetMapping("/showtimesheettomanager/{managerid}")
	public List<Timesheet> fetchAlltimesheet(@PathVariable("managerid") int managerid){
	
		return timesheetRepository.findAllTimesheet(managerid);
	}
	@PatchMapping("/showtimesheettomanager/{managerid}/{timesheetid}")
	public Timesheet updatestatus(@PathVariable int managerid,@PathVariable String timesheetid) {
		Timesheet timesheet = timesheetRepository.findBytimesheetId(timesheetid);
		timesheet.setApproval(1);
		return timesheetRepository.save(timesheet);
		
	}
	
	
}
