package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.dao.Smdtv1Dao;
import com.ssm.domain.Smdtv1;
import com.ssm.service.Smdtv1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Smdtv1ServiceImpl implements Smdtv1Service {

    @Autowired
    private Smdtv1Dao smdtv1Dao;

    @Override
    public int deleteByPrimaryKey(Integer smid) {
        return smdtv1Dao.deleteByPrimaryKey(smid);
    }

    @Override
    public int insert(Smdtv1 record) {
        return smdtv1Dao.insert(record);
    }

    @Override
    public int insertSelective(Smdtv1 record) {
        return smdtv1Dao.insertSelective(record);
    }

    @Override
    public Smdtv1 selectByPrimaryKey(Integer smid) {
        return smdtv1Dao.selectByPrimaryKey(smid);
    }

    @Override
    public int updateByPrimaryKeySelective(Smdtv1 record) {
        return smdtv1Dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Smdtv1 record) {
        return smdtv1Dao.updateByPrimaryKey(record);
    }

    @Override
    public List<Smdtv1> findAll(String fwzl,String bdcdyh) {
        return smdtv1Dao.findAll(fwzl,bdcdyh);
    }
}
