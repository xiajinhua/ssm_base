package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SMDTV_3
 * @author 
 */
@Data
public class Smdtv3 implements Serializable {
    private Integer smid;

    private Integer smkey;

    private Double smsdriw;

    private Double smsdrin;

    private Double smsdrie;

    private Double smsdris;

    private Double smgranule;

    private Object smgeometry;

    private Integer smuserid;

    private Integer smlibtileid;

    private Double smarea;

    private Double smperimeter;

    private Integer objectid1;

    private Integer bsm;

    private Integer fwcs;

    private Double jzmj;

    private Double zdmj;

    private Double zydmj;

    private Double ycjzmj;

    private Double scjzmj;

    private Integer dscs;

    private Integer dxcs;

    private Double jzwgd;

    private Double dxsd;

    private Date jgrq;

    private Integer zts;

    private Double shapeLeng;

    private Double shapeArea;

    private String ysdm;

    private String zrzh;

    private String lszd;

    private String fwbh;

    private String fwmc;

    private String zldz;

    private String fwjg;

    private String ghyt;

    private String jzwjbyt;

    private String xmid;

    private String xmmc;

    private String bgbh;

    private String bz;

    private String fldm;

    private String ssqy;

    private static final long serialVersionUID = 1L;
}