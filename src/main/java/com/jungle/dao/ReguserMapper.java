package com.jungle.dao;

import com.jungle.bean.Reguser;
import com.jungle.bean.ReguserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReguserMapper {
    int countByExample(ReguserExample example);

    int deleteByExample(ReguserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reguser record);

    int insertSelective(Reguser record);

    List<Reguser> selectByExample(ReguserExample example);

    Reguser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reguser record, @Param("example") ReguserExample example);

    int updateByExample(@Param("record") Reguser record, @Param("example") ReguserExample example);

    int updateByPrimaryKeySelective(Reguser record);

    int updateByPrimaryKey(Reguser record);
}