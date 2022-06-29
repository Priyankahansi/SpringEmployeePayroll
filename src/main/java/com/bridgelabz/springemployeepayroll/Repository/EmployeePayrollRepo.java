package com.bridgelabz.springemployeepayroll.Repository;

import com.bridgelabz.springemployeepayroll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePayrollRepo extends JpaRepository<Employee,Integer> {
}
