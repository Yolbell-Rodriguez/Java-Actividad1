package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerPlato {

    private final List<Plato> platos = new ArrayList<>();

    @GetMapping("/")
    public String web(Model model) {
        model.addAttribute("platos", platos);
        return "index";
    }

    @GetMapping("/formulario")
    public String formulario() {
        return "plato";
    }

    @PostMapping("/guarda")
    public String save(Plato plato) {
        this.platos.add(plato);
        return "redirect:/";
    }
}
