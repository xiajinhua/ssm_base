package com.ssm.dao;

import com.ssm.domain.Smdtv1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Smdtv1Dao {
    int deleteByPrimaryKey(Integer smid);

    int insert(Smdtv1 record);

    int insertSelective(Smdtv1 record);

    Smdtv1 selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Smdtv1 record);

    int updateByPrimaryKey(Smdtv1 record);

    List<Smdtv1> findAll(@Param("fwzl")String  fwzl,@Param("bdcdyh") String bdcdyh);

}