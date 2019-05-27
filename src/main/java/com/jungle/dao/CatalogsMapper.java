package com.jungle.dao;

import com.jungle.bean.Catalogs;
import com.jungle.bean.CatalogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatalogsMapper {
    int countByExample(CatalogsExample example);

    int deleteByExample(CatalogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Catalogs record);

    int insertSelective(Catalogs record);

    List<Catalogs> selectByExample(CatalogsExample example);

    Catalogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Catalogs record, @Param("example") CatalogsExample example);

    int updateByExample(@Param("record") Catalogs record, @Param("example") CatalogsExample example);

    int updateByPrimaryKeySelective(Catalogs record);

    int updateByPrimaryKey(Catalogs record);
}