package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerPlato {

    private final List<Plato> platos = new ArrayList<>();

    private final List<String> ingredientesDisponibles = List.of(
            "Tomate", "Cebolla", "Ajo", "Patata", "Huevo", "Pollo",
            "Ternera", "Pescado", "Arroz", "Pasta", "Leche", "Azúcar","Chocolate","Manzana");

    @GetMapping("/")
    public String web(Model model) {
        model.addAttribute("platos", platos);
        return "index";
    }

    @GetMapping("/filtrar")
    public String filtrar(@RequestParam TipoPlatos tipo, Model model) {
        List<Plato> resultado = new ArrayList<>();
        for (Plato p : platos) {
            if (p.getTipo() == tipo) {
                resultado.add(p);
            }
        }
        model.addAttribute("platos", resultado);
        return "index";
    }

    @GetMapping("/formulario")
    public String formulario(Model model) {
        model.addAttribute("ingredientesDisponibles", ingredientesDisponibles);
        model.addAttribute("tipos", TipoPlatos.values());
        return "plato";
    }

    @PostMapping("/guarda")
    public String save(Plato plato) {
        this.platos.add(plato);
        return "redirect:/";
    }

    @GetMapping("/detalle/{id}")
    public String detalle(@PathVariable int id, Model model) {
        if (id < 0 || id >= platos.size()) {
            return "redirect:/";
        }
        model.addAttribute("plato", platos.get(id));
        model.addAttribute("id", id);
        return "detalle";
    }
}