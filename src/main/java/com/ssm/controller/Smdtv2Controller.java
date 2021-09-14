package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.ssm.domain.Smdtv1;
import com.ssm.domain.Smdtv2;
import com.ssm.service.Smdtv2Service;
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
@RequestMapping("zd")
public class Smdtv2Controller {

    @Autowired
    private Smdtv2Service smdtv2Service;

    @ResponseBody
    @RequestMapping("findAll")
    public BaseVo findAll(@RequestParam(defaultValue = "1") int pagenum,
                          @RequestParam(defaultValue = "10") int pagesize,
                          @RequestParam(defaultValue = "") String djh,
                          @RequestParam(defaultValue = "") String bdcqlr,
                          @RequestParam(defaultValue = "") String bdccqzh) {
        PageHelper.startPage(pagenum,pagesize);
        List<Smdtv2> all = smdtv2Service.findAll(djh, bdcqlr, bdccqzh);
        BaseVo baseVo = new BaseVo("200", "查询成功", all);
        return baseVo;
    }
}
