package com.mvictorl.springbootwebapp.service;

import com.mvictorl.springbootwebapp.domain.Filial;
import com.mvictorl.springbootwebapp.repository.FilialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService {

    @Autowired
    private FilialRepo filialRepo;

    public List<Filial> findAll() {
        return filialRepo.findAll();
    }

}