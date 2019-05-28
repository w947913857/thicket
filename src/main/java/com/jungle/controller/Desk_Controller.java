package com.jungle.controller;

import com.jungle.bean.Reguser;
import com.jungle.service.Desk_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Aimelony
 * @Date 2019/5/27 20:20
 * @File Desk_Controller
 **/
@Controller
public class Desk_Controller {
    @Autowired
    private Desk_Service desk_service;

    /**
     * 前台页面登录
     *
     * @param reguser 登录对象
     * @param session
     * @param req
     * @return
     */
    @RequestMapping("Desk_login")
    public String Desk_login(Reguser reguser, HttpSession session, HttpServletRequest req) {
        System.out.println("Desk_login" + reguser);
        if (reguser != null && reguser.getUsername() != null && !reguser.getUsername().equals("")
                && reguser.getPwd() != null && !reguser.getPwd().equals("")) {
            Reguser user = desk_service.login(reguser);
            System.out.println(user);
            if (user != null) {
                session.setAttribute("regUser", user);
                return "redirect:/index.jsp";
            } else {
                req.setAttribute("login", "用户名或密码错误！");
                return "qiantai/login";
            }
        } else {
            req.setAttribute("login", "用户名或密码错误！");
            return "qiantai/login";
        }
    }

    /**
     * 验证手机号
     *
     * @param reguser
     * @return
     */
    @RequestMapping("checkMobile")
    @ResponseBody
    public Map<String, Object> checkMobile(Reguser reguser) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        if (reguser != null && reguser.getUsername() != null && !reguser.getUsername().equals("")) {
            boolean b = desk_service.checkMobile(reguser.getUsername());
            System.out.println(b);
            if (b) {
                map.put("msg", "此手机号已存在！");
            } else {
                map.put("msg", "");
            }
        } else {
            map.put("msg", "请输入手机号码！");
        }
        return map;
    }

    /**
     * 用户注册
     *
     * @param reguser
     * @return
     */
    @RequestMapping("/insRegister")
    @ResponseBody
    public Map<String, Object> register(Reguser reguser) {
        System.out.println("insRegister" + reguser);
        Map<String, Object> map = new HashMap<>();
        if (reguser != null && reguser.getMobile() != null && !"".equals(reguser.getMobile()) && reguser.getEmail() != null && !"".equals(reguser.getEmail())
                && reguser.getPwd() != null && !"".equals(reguser.getPwd())) {
            int i = desk_service.insReguser(reguser);
            System.out.println(i);
            if (i != 0)
                map.put("status", true);
            else
                map.put("status", "false");
        } else {
            map.put("status", "false");
        }
        return map;
    }

    /**
     * 前台用户退出登录
     *
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("regUser");
        return "redirect:/index.jsp";
    }
}
