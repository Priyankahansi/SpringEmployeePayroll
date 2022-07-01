package com.bridgelabz.springemployeepayroll.Repository;

import com.bridgelabz.springemployeepayroll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface EmployeePayrollRepo extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from employee,employee_department where id=id and department=:department",nativeQuery=true)

    List<Employee> findEmployeeByDepartment(String department);
}

