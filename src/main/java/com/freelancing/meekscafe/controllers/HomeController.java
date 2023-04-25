package com.freelancing.meekscafe.controllers;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    public HomeController(){

    }


    

    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/")
    public ModelAndView homeRedirect(ModelMap model){
        return new ModelAndView("redirect:/home", model);
    }
}
