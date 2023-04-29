package com.project.newss.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Новости из IT мира Казахстана");
        return "home.html";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("about", "О сайте");
        return "about.html";
    }

    @GetMapping("/tech")
    public String tech(Model model) {
        model.addAttribute("tech", "О технологии");
        return "tech.html";
    }

    @GetMapping("/friday")
    public String friday(Model model) {
        model.addAttribute("friday", "Black Friday");
        return "friday.html";
    }
    @GetMapping("/sezim")
    public String sezim(Model model) {
        model.addAttribute("sezim", "");
        return "sezim.html";
    }
    @GetMapping("/process")
    public String process(Model model) {
        model.addAttribute("process", "");
        return "process.html";
    }
}

