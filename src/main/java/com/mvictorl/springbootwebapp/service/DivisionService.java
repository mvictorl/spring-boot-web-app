package com.mvictorl.springbootwebapp.service;

import com.mvictorl.springbootwebapp.domain.Division;
import com.mvictorl.springbootwebapp.domain.Filial;
import com.mvictorl.springbootwebapp.repository.DivisionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    @Autowired
    private DivisionRepo divisionRepo;

    public List<Division> findAllByParentFilial(Filial filial) {
        return divisionRepo.findAllByParentFilial(filial);
    }
}