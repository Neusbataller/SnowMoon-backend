package com.example.SnowMoon.shared;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //dice a Spring que esta clase tiene endpoints
public class HealthController {

    @GetMapping("/health") //ruta Get
    public String health(){
        return "SnowMoon backend OK";
    }
}
