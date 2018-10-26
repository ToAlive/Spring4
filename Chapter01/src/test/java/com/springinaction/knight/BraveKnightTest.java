package com.springinaction.knight;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {
    @Test
    public void test(){
        //通过Mockito的mock方法创建一个Quest的实现类
        Quest mockQuest = Mockito.mock(Quest.class);
        //将模拟出来的Quest实现类注入BraveKnight中
        BraveKnight knight = new BraveKnight(mockQuest);
        //调用BraveKnight的embarkOnQuest()方法
        knight.embarkOnQuest();
        //调用Mockito框架的verify()方法验证Quest的实现类的embark()只调用了一次
        Mockito.verify(mockQuest,Mockito.times(1)).embark();
    }
}