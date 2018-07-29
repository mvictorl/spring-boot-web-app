package com.mvictorl.springbootwebapp.service;

import com.mvictorl.springbootwebapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

}