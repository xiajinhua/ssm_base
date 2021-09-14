package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.ssm.domain.Smdtv3;
import com.ssm.service.Smdtv3Service;
import com.ssm.vo.BaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("jzw")
public class Smdtv3Controller {
    @Autowired
    private Smdtv3Service smdtv3Service;

    @ResponseBody
    @RequestMapping("findAll")
    public BaseVo findAll(@RequestParam(defaultValue = "1") int pagenum,
                          @RequestParam(defaultValue = "10") int pagesize,
                          @RequestParam(defaultValue = "") String lszd,
                          @RequestParam(defaultValue = "") String fwmc,
                          @RequestParam(defaultValue = "") String zldz) {
        PageHelper.startPage(pagenum, pagesize);
        List<Smdtv3> all = smdtv3Service.findAll(lszd, fwmc, zldz);
        BaseVo baseVo = new BaseVo("200", "查询成功", all);
        return baseVo;
    }
}
