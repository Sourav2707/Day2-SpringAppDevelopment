package com.bridgelabz.SpringHelloApp.controller;

import com.bridgelabz.SpringHelloApp.user.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HelloController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+ name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+"!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello "+user.getFirstName()+" "+user.getLastName();
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+"!";
    }
}
