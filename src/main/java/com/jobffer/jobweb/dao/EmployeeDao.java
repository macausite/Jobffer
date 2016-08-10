package com.jobffer.jobweb.dao;

import java.util.List;
 
import com.jobffer.jobweb.model.Employee;
 
public interface EmployeeDao {
 
    Employee findById(int id);
 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
 
}
