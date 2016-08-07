package com.jobffer.jobweb.service;

import java.util.List;
import com.jobffer.jobweb.model.Employee;

public interface EmployeeService {
	Employee findById(int id);
	void saveEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployeeBySsn(String Ssn);
	List<Employee> findAllEmployees();
	Employee findEmployeeBySsn(String ssn);
	boolean isEmployeeSsnUnique(Integer id, String ssn);

}