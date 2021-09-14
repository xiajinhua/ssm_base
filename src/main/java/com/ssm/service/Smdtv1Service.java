package com.ssm.service;

import com.ssm.domain.Smdtv1;

import java.util.List;

public interface Smdtv1Service {
    int deleteByPrimaryKey(Integer smid);

    int insert(Smdtv1 record);

    int insertSelective(Smdtv1 record);

    Smdtv1 selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Smdtv1 record);

    int updateByPrimaryKey(Smdtv1 record);

    List<Smdtv1> findAll(String fwzl,String  bdcdyh);
}
