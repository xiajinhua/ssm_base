package com.ssm.service;

import com.ssm.domain.Smdtv2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Smdtv2Service {
    int deleteByPrimaryKey(Integer smid);

    int insert(Smdtv2 record);

    int insertSelective(Smdtv2 record);

    Smdtv2 selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Smdtv2 record);

    int updateByPrimaryKey(Smdtv2 record);

    List<Smdtv2> findAll(String djh, String bdcqlr, String bdccqzh);
}
