package com.ssm.service;

import com.ssm.domain.Smdtv4;

import java.util.List;

public interface Smdtv4Service {
    List<Smdtv4> findAll(String bdcdyh, String mc, String lszd);
}
