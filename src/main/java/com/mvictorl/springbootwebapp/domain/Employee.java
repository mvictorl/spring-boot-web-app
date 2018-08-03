package com.mvictorl.springbootwebapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(max = 75, message = "{employee.lastname.length.tolong}")
    private String lastName;

    @NotBlank
    @Length(max = 50, message = "{employee.firstname.length.tolong}")
    private String firstName;

    @Length(max = 50, message = "{employee.middlename.length.tolong}")
    private String middleName;

    @Transient
    private String shortName;

    @Length(max = 100, message = "{employee.position.length.tolong}")
    private String position;

    public String getShortName() {
        return lastName + ' ' + firstName.substring(0, 1) + '.' + middleName.substring(0, 1);
    }
}