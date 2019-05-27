package com.jungle.dao;

import com.jungle.bean.Userinfor;
import com.jungle.bean.UserinforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforMapper {
    int countByExample(UserinforExample example);

    int deleteByExample(UserinforExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Userinfor record);

    int insertSelective(Userinfor record);

    List<Userinfor> selectByExample(UserinforExample example);

    Userinfor selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Userinfor record, @Param("example") UserinforExample example);

    int updateByExample(@Param("record") Userinfor record, @Param("example") UserinforExample example);

    int updateByPrimaryKeySelective(Userinfor record);

    int updateByPrimaryKey(Userinfor record);
}