package com.example.springboot_02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //(built-in java library class annotation)
public class HomeController { //access-modifier = public
    @RequestMapping("/") //route or endpoint mapping
    public String homePage(Model model) { //access-modifier = public return-type= String
        model.addAttribute("myvar", "Say hello to the people."); //add attribute myvar to object model
        return "hometemplate"; // return the html template: hometemplate.html
    }
}
