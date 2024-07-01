package ru.vladuss.userservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vladuss.userservice.models.User;
import ru.vladuss.userservice.services.dtos.GetAllUserDTO;
import ru.vladuss.userservice.services.impl.UserService;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("getAllUsers")
    ResponseEntity<List<GetAllUserDTO>> getAllUsers() {
        List<GetAllUserDTO> users = userService.getAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/createUser")
    ResponseEntity<User> createNewUser(@RequestBody User user) {
        User newUser = userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }


}
