package com.jungle.dao;

import com.jungle.bean.Clxjorder;
import com.jungle.bean.ClxjorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClxjorderMapper {
    int countByExample(ClxjorderExample example);

    int deleteByExample(ClxjorderExample example);

    int deleteByPrimaryKey(String oid);

    int insert(Clxjorder record);

    int insertSelective(Clxjorder record);

    List<Clxjorder> selectByExample(ClxjorderExample example);

    Clxjorder selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") Clxjorder record, @Param("example") ClxjorderExample example);

    int updateByExample(@Param("record") Clxjorder record, @Param("example") ClxjorderExample example);

    int updateByPrimaryKeySelective(Clxjorder record);

    int updateByPrimaryKey(Clxjorder record);
}