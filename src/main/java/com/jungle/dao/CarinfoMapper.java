package com.jungle.dao;

import com.jungle.bean.Carinfo;
import com.jungle.bean.CarinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarinfoMapper {
    int countByExample(CarinfoExample example);

    int deleteByExample(CarinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carinfo record);

    int insertSelective(Carinfo record);

    List<Carinfo> selectByExample(CarinfoExample example);

    Carinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByExample(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByPrimaryKeySelective(Carinfo record);

    int updateByPrimaryKey(Carinfo record);
}