package com.bridgelabz.springemployeepayroll.controller;
import com.bridgelabz.springemployeepayroll.Entity.Employee;
import com.bridgelabz.springemployeepayroll.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeePayrollController {
    @Autowired
    IEmployeePayrollService service;

    @GetMapping("/hello")
    public String getMessage(){
        String msg=service.getMessage();
        return msg;
    }
    @PostMapping("/AddEmployee")
    public String getEmployee(@RequestBody Employee employee){
        String addEmployee=service.AddEmployee(employee);
        return addEmployee;
    }
    @GetMapping("/getEmployee/{getId}")
    public Employee getEmployee(@PathVariable int getId)
    {
       Employee employee=service.getEmployeeDetails(getId);
        return employee;
    }
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees()
    {
        List<Employee> employees=service.getListOfEmployees();
        return employees;
    }
    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam int id){
        service.deleteEmployee(id);
        return "Deleted....!";
    }
    @PutMapping("/updateEmployee/{getId}")
    public Employee updateEmployee(@PathVariable int getId,@RequestBody Employee employee){
        Employee newEmployee=service.updateEmployee(getId,employee);
        return newEmployee;
    }
}
