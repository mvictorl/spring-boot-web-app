package com.mvictorl.springbootwebapp.repository;

import com.mvictorl.springbootwebapp.domain.Division;
import com.mvictorl.springbootwebapp.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findAllByParentDivision(Division division);
}