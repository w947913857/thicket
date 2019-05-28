package com.jungle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    /**
     * 跳转前台登录页面
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "qiantai/login";
    }

    /**
     * 跳转前台主界面左链页面
     *
     * @return
     */
    @RequestMapping("/left")
    public String left() {
        return "qiantai/left";
    }

    /**
     * 跳转到注册页面
     *
     * @return
     */
    @RequestMapping("/register")
    public String register() {
        return "qiantai/register";
    }

    /**
     * 跳转前台主界面右边主页面
     *
     * @return
     */
    @RequestMapping("/right")
    public String right() {
        return "qiantai/right";
    }


    @RequestMapping("clxjmain")
    public String clxjmain() {
        return "qiantai/clxjmain";
    }

    @RequestMapping("JungleList")
    public String JungleList() {
        return "qiantai/JungleList";
    }
}
