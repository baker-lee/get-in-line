package com.example.getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @GetMapping("/signup")
    public String signup() {
        return "done";
    }

    @GetMapping("/login")
    public String login() {
        return "done";
    }


}