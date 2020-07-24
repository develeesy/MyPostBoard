package com.sy.mypostboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/main")
    public String printMainPage(){
        System.out.println("code for test");
        return "main_page";
    }

}
