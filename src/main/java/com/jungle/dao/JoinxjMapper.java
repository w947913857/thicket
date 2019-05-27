package com.jungle.dao;

import com.jungle.bean.Joinxj;
import com.jungle.bean.JoinxjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinxjMapper {
    int countByExample(JoinxjExample example);

    int deleteByExample(JoinxjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joinxj record);

    int insertSelective(Joinxj record);

    List<Joinxj> selectByExample(JoinxjExample example);

    Joinxj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joinxj record, @Param("example") JoinxjExample example);

    int updateByExample(@Param("record") Joinxj record, @Param("example") JoinxjExample example);

    int updateByPrimaryKeySelective(Joinxj record);

    int updateByPrimaryKey(Joinxj record);
}