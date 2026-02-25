package com.devops.jenkins;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CseController {

    @GetMapping("/home")
    public String disk() {
        return "Welcome to CSE Jenkins Home Screen, Welcome to Home Screen";
    }

    @GetMapping("/cse")
    public String disk2() {
        return "Welcome to Aditya University This was done by 23MH1A05O1";
    }
    
}
