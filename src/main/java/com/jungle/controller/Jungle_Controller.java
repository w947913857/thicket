package com.jungle.controller;

import com.jungle.bean.City;
import com.jungle.bean.Citygroup;
import com.jungle.bean.Clxjmain;
import com.jungle.service.Jungle_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Jungle_Controller {
    @Autowired
    private Jungle_Service jungle_service;

    /**
     * 查询城区
     * @return
     */
    @ResponseBody
    @RequestMapping("selectCityType")
    public Map<String,Object> selectCityType(){
        Map<String,Object> map = jungle_service.selectCityType();
        return map;
    }

    @ResponseBody
    @RequestMapping("selectCityTypeAll")
    public Map<String,Object> selectCityTypeAll(){
        Map<String,Object> map=new HashMap<>();
        List<City> list= jungle_service.selectCityTypeAll();
        map.put("citys",list);
        return map;
    }
    /**
     * 根据条件搜索丛闲居信息
     * @param clxjmain 实体类对象
     * @param request
     * @return
     */
    @RequestMapping("selectJungle")
    public String selectJungle(Clxjmain clxjmain, HttpServletRequest request) throws ParseException {
        List<Clxjmain> list=jungle_service.selectJungle(clxjmain);
        request.setAttribute("JungleList",list);
        return "qiantai/JungleList";
    }

}
