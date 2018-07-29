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
    @Length(max = 75, message = "Last name too long (more then 75 chars)")
    private String lastName;

    @NotBlank
    @Length(max = 50, message = "First name too long (more then 50 chars)")
    private String firstName;

    @Length(max = 50, message = "Middle name too long (more then 50 chars)")
    private String middleName;

    @Transient
    private String shortName;

    @Length(max = 100, message = "Position too long (more then 100 chars)")
    private String position;

    public String getShortName() {
        return lastName + ' ' + firstName.substring(0, 1) + '.' + middleName.substring(0, 1);
    }
}