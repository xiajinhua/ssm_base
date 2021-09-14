package com.ssm.service.impl;

import com.ssm.dao.Smdtv3Dao;
import com.ssm.domain.Smdtv3;
import com.ssm.service.Smdtv3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Smdtv3ServiceImpl implements Smdtv3Service {
    @Autowired
    private Smdtv3Dao smdtv3Dao;

    @Override
    public List<Smdtv3> findAll(String lszd, String fwmc, String zldz) {
        return smdtv3Dao.findAll(lszd, fwmc, zldz);
    }
}
