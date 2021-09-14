package com.ssm.service.impl;

import com.ssm.dao.Smdtv4Dao;
import com.ssm.domain.Smdtv4;
import com.ssm.service.Smdtv4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Smdtv4ServiceImpl implements Smdtv4Service {
    @Autowired
    private Smdtv4Dao smdtv4Dao;


    @Override
    public List<Smdtv4> findAll(String bdcdyh, String mc, String lszd) {
        return smdtv4Dao.findAll(bdcdyh, mc, lszd);
    }
}
