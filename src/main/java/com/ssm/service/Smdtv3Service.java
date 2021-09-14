package com.ssm.service;

import com.ssm.domain.Smdtv3;

import java.util.List;

public interface Smdtv3Service {
    List<Smdtv3> findAll(String lszd, String fwmc, String zldz);
}
