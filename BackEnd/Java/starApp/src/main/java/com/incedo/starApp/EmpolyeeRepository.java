package com.incedo.starApp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incedo.starApp.entities.Employee;

public interface EmpolyeeRepository extends JpaRepository<Employee, Integer> {

}
