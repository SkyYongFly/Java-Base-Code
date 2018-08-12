package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpring {

    @RequestMapping(value = "/hellospring")
    public String  handleRequest(Model model){
        model.addAttribute("message","Hello Spring!");
        return "welcome";
    }
}
