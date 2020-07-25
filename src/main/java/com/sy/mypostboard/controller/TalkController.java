package com.sy.mypostboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/talk")
public class TalkController {
    @GetMapping("")
    public String printTalkPage(){
        return "talk_page";
    }
}
