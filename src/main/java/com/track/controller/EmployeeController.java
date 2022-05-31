package com.track.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.track.entity.Employee;
import com.track.exception.EmployeeNotFoundException;
import com.track.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/register")
	public Employee registerEmployee(@RequestBody @Valid Employee employee) {
		return employeeService.registerEmployee(employee);
	}
	
	@GetMapping(value = "/search/{id}")
	public Employee searchEmployee(@PathVariable ("id") @Valid int userId) {
		return employeeService.searchEmployee(userId);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Employee deleteEmployee(@PathVariable("id") int userId) throws EmployeeNotFoundException {
		return employeeService.deleteEmployee(userId);
	}
	
	
	@GetMapping(value = "/getAll")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
}