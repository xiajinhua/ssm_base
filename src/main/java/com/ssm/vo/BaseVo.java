package com.ssm.vo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageSerializable;
import com.ssm.domain.Smdtv1;

import java.util.Collection;
import java.util.List;

public class BaseVo<T> {
    private String code;
    private String msg;


    private PageInfo pageInfo;

    public BaseVo(String code, String msg, List list) {

        this.setCode(code);
        this.setMsg(msg);
        this.setPageInfo(new PageInfo(list));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
