package com.track.service;

import java.util.List;

import com.track.entity.Employee;

public interface EmployeeService {
	public Employee registerEmployee(Employee employee);
	public Employee searchEmployee(int userId);
	public Employee deleteEmployee(int userId);
	
	public List<Employee> getEmployees();
}