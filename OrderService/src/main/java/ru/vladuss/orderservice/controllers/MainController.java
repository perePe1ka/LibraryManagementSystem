package ru.vladuss.orderservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("/checkHealth")
    String checkHealth() {
        return "Да блять, и я здоров";
    }
}
