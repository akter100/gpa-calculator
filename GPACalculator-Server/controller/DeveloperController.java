package edu.citytech.cst.GPACalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("developer")

public class DeveloperController {

    @GetMapping("/name")
    public String getDeveloperInformation(){
        return "Akter,Beauty";
    }
}
