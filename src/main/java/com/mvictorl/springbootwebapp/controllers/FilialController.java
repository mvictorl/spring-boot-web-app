package com.mvictorl.springbootwebapp.controllers;


import com.mvictorl.springbootwebapp.domain.Filial;
import com.mvictorl.springbootwebapp.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/filial")
public class FilialController {

    @Autowired
    private FilialService filialService;

    @GetMapping
    public String filialList(Model model) {
        model.addAttribute("filials", filialService.findAll());
        return "filial";
    }

    @GetMapping("{filial}")
    public String getFilial(@PathVariable Filial filial, Model model) {
        model.addAttribute("filials", filialService.findAll());
        model.addAttribute("filial", filial);
        return "filial";
    }
}
