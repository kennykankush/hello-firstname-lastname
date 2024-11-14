package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class NameReturnController {


    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/welcome")
    public String postMethodName(@RequestParam("fname") String fname, @RequestParam("lname") String lname, Model model) {
        model.addAttribute("FIRSTNAME", fname);
        model.addAttribute("LASTNAME", lname);

        return "welcome";
    }
    

}
