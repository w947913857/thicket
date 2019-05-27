package com.jungle.dao;

import com.jungle.bean.Uploadfiles;
import com.jungle.bean.UploadfilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadfilesMapper {
    int countByExample(UploadfilesExample example);

    int deleteByExample(UploadfilesExample example);

    int deleteByPrimaryKey(Integer fileid);

    int insert(Uploadfiles record);

    int insertSelective(Uploadfiles record);

    List<Uploadfiles> selectByExample(UploadfilesExample example);

    Uploadfiles selectByPrimaryKey(Integer fileid);

    int updateByExampleSelective(@Param("record") Uploadfiles record, @Param("example") UploadfilesExample example);

    int updateByExample(@Param("record") Uploadfiles record, @Param("example") UploadfilesExample example);

    int updateByPrimaryKeySelective(Uploadfiles record);

    int updateByPrimaryKey(Uploadfiles record);
}