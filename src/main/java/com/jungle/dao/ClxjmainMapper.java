package com.jungle.dao;

import com.jungle.bean.Clxjmain;
import com.jungle.bean.ClxjmainExample;
import com.jungle.bean.ClxjmainWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClxjmainMapper {
    int countByExample(ClxjmainExample example);

    int deleteByExample(ClxjmainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClxjmainWithBLOBs record);

    int insertSelective(ClxjmainWithBLOBs record);

    List<ClxjmainWithBLOBs> selectByExampleWithBLOBs(ClxjmainExample example);

    List<Clxjmain> selectByExample(ClxjmainExample example);

    List<Clxjmain> selectByWhere(Clxjmain clxjmain);

    ClxjmainWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClxjmainWithBLOBs record, @Param("example") ClxjmainExample example);

    int updateByExampleWithBLOBs(@Param("record") ClxjmainWithBLOBs record, @Param("example") ClxjmainExample example);

    int updateByExample(@Param("record") Clxjmain record, @Param("example") ClxjmainExample example);

    int updateByPrimaryKeySelective(ClxjmainWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClxjmainWithBLOBs record);

    int updateByPrimaryKey(Clxjmain record);
}