package com.mvictorl.springbootwebapp.controllers;


import com.mvictorl.springbootwebapp.domain.Division;
import com.mvictorl.springbootwebapp.domain.Filial;
import com.mvictorl.springbootwebapp.service.DivisionService;
import com.mvictorl.springbootwebapp.service.EmployeeService;
import com.mvictorl.springbootwebapp.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private FilialService filialService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String chooseFilial(Model model) {
        model.addAttribute("filials", filialService.findAll());
        return "employee";
    }

    @GetMapping("/filial")
    public String allFilials(Model model) {
        model.addAttribute("filials", filialService.findAll());
        model.addAttribute("employees", employeeService.findAll());
        return "employee";
    }

    @GetMapping("/filial/{filial}")
    public String byFilial(@PathVariable Filial filial, Model model) {
        model.addAttribute("filials", filialService.findAll());
        model.addAttribute("filial", filial);
        model.addAttribute("divisions", divisionService.findAllByParentFilial(filial));
        return "employee";
    }

    @GetMapping("/filial/{filial}/division")
    public String allDivisions(@PathVariable Filial filial, Model model) {
        model.addAttribute("filials", filialService.findAll());
        model.addAttribute("filial", filial);
        model.addAttribute("divisions", divisionService.findAllByParentFilial(filial));
        return "employee";
    }

    @GetMapping("/filial/{filial}/division/{division}")
    public String byDivisions(@PathVariable Filial filial, @PathVariable Division division, Model model) {
        model.addAttribute("filials", filialService.findAll());
        model.addAttribute("filial", filial);
        model.addAttribute("divisions", divisionService.findAllByParentFilial(filial));
        model.addAttribute("employees", employeeService.findAllByParentDivision(division));
        return "employee";
    }
}
