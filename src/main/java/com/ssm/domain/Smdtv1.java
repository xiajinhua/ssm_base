package com.ssm.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;

/**
 * SMDTV_1
 * @author 
 */
@Data
public class Smdtv1 implements Serializable {
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

    private Long objectid1;

    private Long objectid;

    private String 幢号;

    private String 室号;

    private String 备注;

    private Long cg;

    private Long qsgd;

    private String fwzl;

    private String bdcdyh;

    private Double shapeLeng;

    private Long cs;

    private String tdyt;

    private Double shapeLe1;

    private Double shapeArea;

    private Double shapeleng;

    private Double shapele1;

    private Double shapearea;

    private static final long serialVersionUID = 1L;


}