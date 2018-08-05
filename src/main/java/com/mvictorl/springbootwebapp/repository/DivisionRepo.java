package com.mvictorl.springbootwebapp.repository;

import com.mvictorl.springbootwebapp.domain.Division;
import com.mvictorl.springbootwebapp.domain.Filial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DivisionRepo extends JpaRepository<Division, Long> {

    List<Division> findAllByParentFilial(Filial filial);
}
