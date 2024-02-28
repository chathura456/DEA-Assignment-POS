package com.example.demo.controller;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User addStudent(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/test")
    public String testConnection() {
        return "Connection OK!";
    }
}
