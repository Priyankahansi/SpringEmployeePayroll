package com.bridgelabz.springemployeepayroll.service;

import com.bridgelabz.springemployeepayroll.Entity.Employee;
import com.bridgelabz.springemployeepayroll.Repository.EmployeePayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    EmployeePayrollRepo repo;

    @Override
    public String getMessage() {

        return "hello Welcome to employee payroll";
    }

    @Override
    public String AddEmployee(Employee employee) {
        repo.save(employee);
        return employee.toString();
    }

    @Override
    public Employee getEmployeeDetails(int getId) {
           Optional<Employee> employee= repo.findById(getId);
            return employee.get();
        }

    @Override
    public List<Employee> getListOfEmployees() {
        List<Employee> employees=repo.findAll();
        return employees;
    }

    @Override
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }

    @Override
    public Employee updateEmployee(int getId, Employee employee) {
        Optional<Employee> newEmployee = repo.findById(getId);
        if (newEmployee.isPresent()) {
            newEmployee.get().setGender(employee.getGender());
            newEmployee.get().setDepartment(employee.getDepartment());
            newEmployee.get().setEmail(employee.getEmail());
            newEmployee.get().setNote(employee.getNote());
            newEmployee.get().setSalary(employee.getSalary());
            newEmployee.get().setDate(employee.getDate());
            newEmployee.get().setProfilePic(employee.getProfilePic());
            newEmployee.get().setEmployeeName(employee.getEmployeeName());
            repo.save(newEmployee.get());
            return newEmployee.get();
        } else {
            return null;
        }
    }
}

