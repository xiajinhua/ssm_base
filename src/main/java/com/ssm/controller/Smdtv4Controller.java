package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.ssm.domain.Smdtv4;
import com.ssm.service.Smdtv4Service;
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
@RequestMapping("fw")
public class Smdtv4Controller {

    @Autowired
    private Smdtv4Service smdtv4Service;

    @ResponseBody
    @RequestMapping("findAll")
    public BaseVo findAll(@RequestParam(defaultValue = "1") int pagenum,
                          @RequestParam(defaultValue = "10") int pagesize,
                          @RequestParam(defaultValue = "") String bdcdyh,
                          @RequestParam(defaultValue = "") String mc,
                          @RequestParam(defaultValue = "") String zldz) {
        PageHelper.startPage(pagenum, pagesize);
        List<Smdtv4> all = smdtv4Service.findAll(bdcdyh, mc, zldz);
        BaseVo baseVo = new BaseVo("200", "查询成功", all);
        return baseVo;
    }
}
