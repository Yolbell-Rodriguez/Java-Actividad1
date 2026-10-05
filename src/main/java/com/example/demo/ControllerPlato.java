package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPlato {

    @RequestMapping("/plato")
    String plato(){
        return "plato";
    }

    @PostMapping("/datos")
    String datos(Plato plato, Model model){
        System.out.println(plato);
        model.addAttribute("plato", plato);
        return "datos";
    }
}
