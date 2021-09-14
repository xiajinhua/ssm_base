package com.ssm.dao;

import com.ssm.domain.Smdtv2;
import com.ssm.domain.Smdtv3;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Smdtv3Dao {
    int deleteByPrimaryKey(Integer smid);

    int insert(Smdtv3 record);

    int insertSelective(Smdtv3 record);

    Smdtv3 selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Smdtv3 record);

    int updateByPrimaryKey(Smdtv3 record);

    List<Smdtv3> findAll(@Param("lszd")String  lszd, @Param("fwmc") String fwmc, @Param("zldz")String zldz);
}