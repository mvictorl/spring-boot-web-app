package com.mvictorl.springbootwebapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(max = 254, message = "{filial.fullname.length.tolong}")
    private String fullName;

    @Length(max = 100, message = "{filial.shortname.length.tolong}")
    private String shortName;

/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chif_employee_id")
    private Employee filialChif;
*/

}