package com.jungle.dao;

import com.jungle.bean.Citygroup;
import com.jungle.bean.CitygroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CitygroupMapper {
    int countByExample(CitygroupExample example);

    int deleteByExample(CitygroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Citygroup record);

    int insertSelective(Citygroup record);

    List<Citygroup> selectByExample(CitygroupExample example);

    Citygroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Citygroup record, @Param("example") CitygroupExample example);

    int updateByExample(@Param("record") Citygroup record, @Param("example") CitygroupExample example);

    int updateByPrimaryKeySelective(Citygroup record);

    int updateByPrimaryKey(Citygroup record);
}