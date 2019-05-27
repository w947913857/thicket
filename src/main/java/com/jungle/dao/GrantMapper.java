package com.jungle.dao;

import com.jungle.bean.Grant;
import com.jungle.bean.GrantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrantMapper {
    int countByExample(GrantExample example);

    int deleteByExample(GrantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grant record);

    int insertSelective(Grant record);

    List<Grant> selectByExample(GrantExample example);

    Grant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grant record, @Param("example") GrantExample example);

    int updateByExample(@Param("record") Grant record, @Param("example") GrantExample example);

    int updateByPrimaryKeySelective(Grant record);

    int updateByPrimaryKey(Grant record);
}