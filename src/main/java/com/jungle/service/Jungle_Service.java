package com.jungle.service;

import com.jungle.bean.City;
import com.jungle.bean.Citygroup;
import com.jungle.bean.Clxjmain;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface Jungle_Service {

    //查询地区并分类
    Map<String,Object> selectCityType();
    List<City> selectCityTypeAll();
    //根据条件搜索丛闲居信息
    List<Clxjmain> selectJungle(Clxjmain clxjmain);
}
