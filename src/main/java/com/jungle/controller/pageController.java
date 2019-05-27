package com.jungle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("login")
    public String login(){
        return "qiantai/login";
    }
    @RequestMapping("clxjmain")
    public String clxjmain(){
        return "qiantai/clxjmain";
    }
    @RequestMapping("JungleList")
    public String JungleList(){
        return "qiantai/JungleList";
    }
}
