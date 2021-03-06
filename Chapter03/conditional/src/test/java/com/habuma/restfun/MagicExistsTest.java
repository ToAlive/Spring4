package com.habuma.restfun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalConfig.class)
public class MagicExistsTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void test(){
        System.out.println(context.getBean(MagicBean.class));
    }

}