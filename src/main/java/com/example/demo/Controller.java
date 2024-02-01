package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/v2/ciao/Lombardia")
    public SalutoDTO salutare(@RequestParam String nome) {
        String provincia = "Lombardia";
        String saluto = "Ciao " + nome + " , come è il tempo in " + provincia + "?";
        return new SalutoDTO(nome, provincia, saluto);
    }
}




