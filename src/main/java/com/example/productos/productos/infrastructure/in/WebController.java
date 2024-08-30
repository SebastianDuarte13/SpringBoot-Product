package com.example.productos.productos.infrastructure.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String index() {
        return "web-component"; // Asegúrate de que este nombre coincida con el archivo web-component.html
    }
}
