package com.connections.travelConnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String homePage() {
        return "Lets get started"; // This will return the index.html page from src/main/resources/templates
    }
}
