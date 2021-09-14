package com.ssm.service.impl;

import com.ssm.dao.Smdtv2Dao;
import com.ssm.domain.Smdtv2;
import com.ssm.service.Smdtv2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Smdtv2ServiceImpl implements Smdtv2Service {

    @Autowired
    private Smdtv2Dao smdtv2Dao;

    @Override
    public int deleteByPrimaryKey(Integer smid) {
        return smdtv2Dao.deleteByPrimaryKey(smid);
    }

    @Override
    public int insert(Smdtv2 record) {
        return smdtv2Dao.insert(record);
    }

    @Override
    public int insertSelective(Smdtv2 record) {
        return smdtv2Dao.insertSelective(record);
    }

    @Override
    public Smdtv2 selectByPrimaryKey(Integer smid) {
        return smdtv2Dao.selectByPrimaryKey(smid);
    }

    @Override
    public int updateByPrimaryKeySelective(Smdtv2 record) {
        return smdtv2Dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Smdtv2 record) {
        return smdtv2Dao.updateByPrimaryKey(record);
    }

    @Override
    public List<Smdtv2> findAll(String djh, String bdcqlr, String bdccqzh) {
        return smdtv2Dao.findAll(djh,bdcqlr,bdccqzh);
    }
}
