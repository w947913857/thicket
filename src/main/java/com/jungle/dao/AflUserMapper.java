package com.jungle.dao;

import com.jungle.bean.AflUser;
import com.jungle.bean.AflUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AflUserMapper {
    int countByExample(AflUserExample example);

    int deleteByExample(AflUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AflUser record);

    int insertSelective(AflUser record);

    List<AflUser> selectByExampleWithBLOBs(AflUserExample example);

    List<AflUser> selectByExample(AflUserExample example);

    AflUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AflUser record, @Param("example") AflUserExample example);

    int updateByExampleWithBLOBs(@Param("record") AflUser record, @Param("example") AflUserExample example);

    int updateByExample(@Param("record") AflUser record, @Param("example") AflUserExample example);

    int updateByPrimaryKeySelective(AflUser record);

    int updateByPrimaryKeyWithBLOBs(AflUser record);

    int updateByPrimaryKey(AflUser record);
}