package com.ltp.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class gradeController {
    
    @GetMapping("/grades")
    public String getGrades(Model model) {
        grades grade = new grades("harry", "Potions", "C-");
        model.addAttr
        return "grades.html";
    }
    
}
