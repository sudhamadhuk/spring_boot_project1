package com.gfg.employeeapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gfg.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
