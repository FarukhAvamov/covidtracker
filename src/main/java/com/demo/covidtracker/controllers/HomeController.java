package com.demo.covidtracker.controllers;

import com.demo.covidtracker.services.CovidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CovidServices covidServices;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", covidServices.getAllStats());
        return "home";
    }
}
