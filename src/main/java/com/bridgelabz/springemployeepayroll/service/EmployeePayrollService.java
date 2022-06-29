package com.bridgelabz.springemployeepayroll.service;

import com.bridgelabz.springemployeepayroll.Dto.EmployeeDTO;
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
    public Employee updateEmployee(int getId, EmployeeDTO employeedto) {
        Optional<Employee> newEmployee = repo.findById(getId);
        if (newEmployee.isPresent()) {
            newEmployee.get().setGender(employeedto.getGender());
            newEmployee.get().setDepartment(employeedto.getDepartment());
            newEmployee.get().setEmail(employeedto.getEmail());
            newEmployee.get().setNote(employeedto.getNote());
            newEmployee.get().setSalary(employeedto.getSalary());
            newEmployee.get().setDate(employeedto.getDate());
            newEmployee.get().setProfilePic(employeedto.getProfilePic());
            newEmployee.get().setEmployeeName(employeedto.getEmployeeName());
            repo.save(newEmployee.get());
            return newEmployee.get();
        } else {
            return null;
        }
    }

    @Override
    public String AddEmployee(EmployeeDTO employeedto) {
        Employee employee=new Employee(employeedto);
        repo.save(employee);
        return employee.toString();
    }
}

