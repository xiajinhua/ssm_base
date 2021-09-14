package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.domain.Smdtv1;
import com.ssm.service.Smdtv1Service;
import com.ssm.vo.BaseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("smdtv")
public class Smdtv1Controller {

    @Autowired
    private Smdtv1Service smdtv1Service;

    @ResponseBody
    @RequestMapping("findAll")
    public BaseVo findAll(@RequestParam(defaultValue = "1") int pagenum,
                            @RequestParam(defaultValue = "10") int pagesize,
                            @RequestParam(defaultValue = "") String fwzl,
                            @RequestParam(defaultValue = "") String bdcdyh) {
        PageHelper.startPage(pagenum, pagesize);
        List<Smdtv1> all = smdtv1Service.findAll(fwzl, bdcdyh);
        BaseVo baseVo = new BaseVo("200", "查询成功", all);
        return baseVo;
    }
}
