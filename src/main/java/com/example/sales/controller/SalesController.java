package com.example.sales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Sales Portal");
        return "index";
    }

    @GetMapping("/api/health")
    public String health() {
        return "OK";
    }
}
