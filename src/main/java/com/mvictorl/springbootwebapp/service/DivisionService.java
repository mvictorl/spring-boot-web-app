package com.mvictorl.springbootwebapp.service;

import com.mvictorl.springbootwebapp.repository.DivisionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionService {

    @Autowired
    private DivisionRepo divisionRepo;

}