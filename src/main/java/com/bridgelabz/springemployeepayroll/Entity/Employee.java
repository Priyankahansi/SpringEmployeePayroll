package com.bridgelabz.springemployeepayroll.Entity;

import com.bridgelabz.springemployeepayroll.Dto.EmployeeDTO;
import jdk.jfr.Name;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String gender;
    private String employeeName;
    private String department;
    private long salary;
    private String email;
    private LocalDate Date;
    private String profilePic;
    private String note;

    public Employee(EmployeeDTO employeeDto) {
        this.gender = employeeDto.getGender();
        this.employeeName = employeeDto.getEmployeeName();
        this.department = employeeDto.getDepartment();
        this.salary = employeeDto.getSalary();
        this.email = employeeDto.getEmail();
        Date = employeeDto.getDate();
        this.profilePic = employeeDto.getProfilePic();
        this.note = employeeDto.getNote();
    }
}
