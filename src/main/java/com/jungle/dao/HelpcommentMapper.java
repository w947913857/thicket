package com.jungle.dao;

import com.jungle.bean.Helpcomment;
import com.jungle.bean.HelpcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpcommentMapper {
    int countByExample(HelpcommentExample example);

    int deleteByExample(HelpcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Helpcomment record);

    int insertSelective(Helpcomment record);

    List<Helpcomment> selectByExample(HelpcommentExample example);

    Helpcomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Helpcomment record, @Param("example") HelpcommentExample example);

    int updateByExample(@Param("record") Helpcomment record, @Param("example") HelpcommentExample example);

    int updateByPrimaryKeySelective(Helpcomment record);

    int updateByPrimaryKey(Helpcomment record);
}