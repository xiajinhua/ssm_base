package com.ssm.dao;

import com.ssm.domain.Smdtv1;
import com.ssm.domain.Smdtv2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Smdtv2Dao {
    int deleteByPrimaryKey(Integer smid);

    int insert(Smdtv2 record);

    int insertSelective(Smdtv2 record);

    Smdtv2 selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Smdtv2 record);

    int updateByPrimaryKey(Smdtv2 record);

    List<Smdtv2> findAll(@Param("djh")String  djh, @Param("bdcqlr") String bdcqlr,@Param("bdccqzh")String bdccqzh);
}