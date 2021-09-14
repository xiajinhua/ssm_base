package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SMDTV_4
 * @author 
 */
@Data
public class Smdtv4 implements Serializable {
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

    private Integer objectid;

    private Integer szcs;

    private Double cg;

    private Double qsgd;

    private Date jlrq;

    private Date gxrq;

    private Double shapeLeng;

    private Double shapeArea;

    private String bdcdyh;

    private String mc;

    private String zldz;

    private String lszd;

    private String zrzh;

    private String sh;

    private String bz;

    private static final long serialVersionUID = 1L;
}