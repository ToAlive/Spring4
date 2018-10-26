package com.springinaction.knight.config;

import com.springinaction.knight.BraveKnight;
import com.springinaction.knight.Knight;
import com.springinaction.knight.Quest;
import com.springinaction.knight.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    /*创建KnightBean*/
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    /*创建QuestBean*/
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
