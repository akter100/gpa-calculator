package edu.citytech.cst.GPACalculator.controller;

import edu.citytech.cst.GPACalculator.businessobject.GradeBO;
import edu.citytech.cst.GPACalculator.model.Grade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("grade")

public class GradeController {

    @GetMapping("/midsemester")
    public String getMidsemesterGrade(@RequestParam float grade) {
        return new GradeBO().getMidsemesterGrade(grade);

    }
    //http://localhost:8080/grade/gpa?grade=50
    @GetMapping("/gpa")
    public Grade determineGPA(@RequestParam float grade){
        return new GradeBO().getGPA(grade);
    }
    //http://localhost:8080/grade/range
    @GetMapping("/range")
    public ArrayList<Grade> range(@RequestParam(defaultValue = "5" ) int incrementBy){
        return new GradeBO().range(incrementBy);

    }


}
