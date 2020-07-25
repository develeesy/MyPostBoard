package com.sy.mypostboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String printMainPage(){
        System.out.println("[main page]");
        return "main_page";
    }

    @GetMapping("/info")
    public String printInfoPage(){
        System.out.println("[info page]");
        return "info_page";
    }
}
