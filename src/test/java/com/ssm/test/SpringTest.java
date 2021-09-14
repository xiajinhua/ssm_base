package com.ssm.test;

import com.github.pagehelper.PageInfo;
import com.ssm.dao.Smdtv1Dao;
import com.ssm.domain.Smdtv1;
import com.ssm.service.Smdtv1Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private Smdtv1Dao smdtv1Dao;

    @Autowired
    private Smdtv1Service smdtv1Service;

    @Test
    public void test1() throws SQLException {

        List<Smdtv1> all = smdtv1Service.findAll("","");
        PageInfo pageInfo = new PageInfo(all);

        for (Smdtv1 smdtv1:
             all) {
            System.out.println(smdtv1.getSmid());
        };
    }

}
