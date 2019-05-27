package com.jungle.dao;

import com.jungle.bean.Carorder;
import com.jungle.bean.CarorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarorderMapper {
    int countByExample(CarorderExample example);

    int deleteByExample(CarorderExample example);

    int deleteByPrimaryKey(String oid);

    int insert(Carorder record);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample(CarorderExample example);

    Carorder selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByExample(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByPrimaryKeySelective(Carorder record);

    int updateByPrimaryKey(Carorder record);
}