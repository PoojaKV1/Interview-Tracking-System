package com.track.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.track.entity.Employee;
import com.track.exception.EmployeeNotFoundException;
import com.track.repository.EmployeeRepository;
import com.track.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee registerEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee searchEmployee(int userId) {
		Optional<Employee> employee = employeeRepo.findById(userId);
		Employee emp = null;
		if (employee.isPresent()) {
			emp = employee.get();
		} else {
			throw new EmployeeNotFoundException("No such employee");
		}
		return emp;
	}

	@Override
	public Employee deleteEmployee(int userId) {
		Employee employee=null;
        Optional<Employee> opEmp = employeeRepo.findById(userId);
        if(opEmp.isPresent()) {
         employee=opEmp.get();
         employeeRepo.delete(employee);
        }
        else {
			throw new EmployeeNotFoundException("No such employee");
		}
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}

}