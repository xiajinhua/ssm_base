package com.ssm.dao;

import com.ssm.domain.Smdtv4;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Smdtv4Dao {
    int deleteByPrimaryKey(Integer smid);

    int insert(Smdtv4 record);

    int insertSelective(Smdtv4 record);

    Smdtv4 selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Smdtv4 record);

    int updateByPrimaryKey(Smdtv4 record);

    List<Smdtv4> findAll(@Param("bdcdyh")String  bdcdyh, @Param("mc") String mc, @Param("zldz")String zldz);
}