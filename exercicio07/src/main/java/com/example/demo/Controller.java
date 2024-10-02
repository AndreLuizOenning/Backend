package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/recomendar")
    public String recomendarFilme(@RequestParam String genero, @RequestParam String ambiente) {

        if ("acao".equalsIgnoreCase(genero) && "futurista".equalsIgnoreCase(ambiente)) {return "Homens de Preto";}

        else {return "Não encontrado.";}
    }
}
