package com.mvictorl.springbootwebapp.controllers;


import com.mvictorl.springbootwebapp.domain.Filial;
import com.mvictorl.springbootwebapp.service.DivisionService;
import com.mvictorl.springbootwebapp.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/division")
public class DivisionController {

    @Autowired
    private FilialService filialService;

    @Autowired
    private DivisionService divisionService;

    @GetMapping
    public String filialList(Model model) {
        model.addAttribute("filials", filialService.findAll());
        return "division";
    }

    @GetMapping("/filial/{filial}")
    public String getFilial(@PathVariable Filial filial, Model model) {
        model.addAttribute("filials", filialService.findAll());
        model.addAttribute("filial", filial);
        model.addAttribute("divisions", divisionService.findAllByParentFilial(filial));
        return "division";
    }
}
