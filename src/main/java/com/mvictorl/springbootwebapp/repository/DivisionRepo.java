package com.mvictorl.springbootwebapp.repository;

import com.mvictorl.springbootwebapp.domain.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepo extends JpaRepository<Division, Long> {
}
