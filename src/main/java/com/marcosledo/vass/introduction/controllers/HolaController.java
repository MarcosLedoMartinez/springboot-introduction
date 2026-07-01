package com.marcosledo.vass.introduction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping ("/saludo")
public class HolaController {
    @GetMapping
    public String saludar(){
        return "¡Hola desde Spring Boot!";
    }
}