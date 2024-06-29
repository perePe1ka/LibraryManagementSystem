package ru.vladuss.learn.librarymanagementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladuss.learn.librarymanagementsystem.services.impl.UserService;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/checkHealth")
    String healthCheck() {
        return "Здоров я, заебал";
    }


}
