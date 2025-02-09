package com.example.thymeleaf.thymeleaf_wiky.controller;

import com.example.thymeleaf.thymeleaf_wiky.model.FormularioContacto;
import com.example.thymeleaf.thymeleaf_wiky.repository.FormularioContactoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WikiController {

    private final FormularioContactoRepository formularioContactoRepository;

    public WikiController(FormularioContactoRepository formularioContactoRepository) {
        this.formularioContactoRepository = formularioContactoRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contacto(Model model) {
        model.addAttribute("formularioContacto", new FormularioContacto());
        return "contact";
    }

    @PostMapping("/contact")
    public String enviarFormulario(FormularioContacto formularioContacto) {
        formularioContactoRepository.save(formularioContacto);
        return "redirect:/contact?exito";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/project")
    public String project() {
        return "project";
    }

    @GetMapping("/architecture")
    public String architecture() {
        return "architecture";
    }

    @GetMapping("/deployment")
    public String deployment() {
        return "deployment";
    }

    @GetMapping("/development")
    public String development() {
        return "development";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
