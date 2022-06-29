package com.bridgelabz.springemployeepayroll.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
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

    public Employee() {
    }

    public Employee(int id, String gender, String employeeName, String department, long salary,
                    String email, LocalDate date, String profilePic, String note) {
        this.id = id;
        this.gender = gender;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.email = email;
        Date = date;
        this.profilePic = profilePic;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", Date=" + Date +
                ", profilePic='" + profilePic + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
