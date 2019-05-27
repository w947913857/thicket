package com.jungle.dao;

import com.jungle.bean.Joincar;
import com.jungle.bean.JoincarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoincarMapper {
    int countByExample(JoincarExample example);

    int deleteByExample(JoincarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joincar record);

    int insertSelective(Joincar record);

    List<Joincar> selectByExample(JoincarExample example);

    Joincar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joincar record, @Param("example") JoincarExample example);

    int updateByExample(@Param("record") Joincar record, @Param("example") JoincarExample example);

    int updateByPrimaryKeySelective(Joincar record);

    int updateByPrimaryKey(Joincar record);
}