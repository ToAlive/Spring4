package com.springinaction.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        //加载spring上下文
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Knights.xml");
        //获取knight bean
        Knight knight = context.getBean(Knight.class);
        //调用knight的方法
        knight.embarkOnQuest();
        context.close();
    }
}