package com.mvictorl.springbootwebapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(max = 254, message = "Full filial name too long (more then 254 chars)")
    private String fullName;

    @Length(max = 100, message = "Filial name too long (more then 100 chars)")
    private String shortName;

}