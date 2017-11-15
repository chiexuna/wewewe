package com.chiexuna.wewewe.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/")
    public String mainPage() {

        return "app.home";
    }

    @RequestMapping("/about")
    public String about() {

        return "app.about";
    }
}
