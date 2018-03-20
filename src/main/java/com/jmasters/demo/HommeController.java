package com.jmasters.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HommeController {

    @GetMapping ("/")
    public String index() {
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "/login";

    }

    @GetMapping("/register")
    public String register() {
        return "/register";

    }
    @GetMapping("/Depot")
    public String Depot() {
        return "/Depot";

    }


}
