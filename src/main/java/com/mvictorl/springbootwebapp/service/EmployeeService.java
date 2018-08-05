package com.mvictorl.springbootwebapp.service;

import com.mvictorl.springbootwebapp.domain.Division;
import com.mvictorl.springbootwebapp.domain.Employee;
import com.mvictorl.springbootwebapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public List<Employee> findAllByParentDivision(Division division) {
        return employeeRepo.findAllByParentDivision(division);
    }

}