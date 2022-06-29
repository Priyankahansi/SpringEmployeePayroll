package com.bridgelabz.springemployeepayroll.service;

import com.bridgelabz.springemployeepayroll.Dto.EmployeeDTO;
import com.bridgelabz.springemployeepayroll.Entity.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    String getMessage();

    Employee getEmployeeDetails(int getId);

    List<Employee> getListOfEmployees();

    void deleteEmployee(int id);

    Employee updateEmployee(int getId, EmployeeDTO employeedto);

    String AddEmployee(EmployeeDTO employeeDTO);

}
