package com.bridgelabz.SpringHelloApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello() {
        return "Hello";
    }
    @GetMapping("web/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello World, I'm Sourav");
        return "message";
    }
}
