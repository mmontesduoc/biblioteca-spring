package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//control

@RestController 
public class HolaMundoController {
    @GetMapping("/hola")
    public String holaMundo () {
        return "!HOLA MUNDO cruel";
    }
    
                
}
