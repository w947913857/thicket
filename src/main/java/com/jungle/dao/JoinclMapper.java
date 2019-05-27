package com.jungle.dao;

import com.jungle.bean.Joincl;
import com.jungle.bean.JoinclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinclMapper {
    int countByExample(JoinclExample example);

    int deleteByExample(JoinclExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joincl record);

    int insertSelective(Joincl record);

    List<Joincl> selectByExample(JoinclExample example);

    Joincl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joincl record, @Param("example") JoinclExample example);

    int updateByExample(@Param("record") Joincl record, @Param("example") JoinclExample example);

    int updateByPrimaryKeySelective(Joincl record);

    int updateByPrimaryKey(Joincl record);
}