package com.robinsdesmers.myProjetWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secret() {
        return "https://wildcodeschool.fr/nos-campus/";
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

}
