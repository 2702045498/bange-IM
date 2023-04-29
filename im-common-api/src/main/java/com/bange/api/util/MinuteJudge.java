package com.bange.api.util;

import java.time.Duration;
import java.time.LocalDateTime;

public class MinuteJudge extends TimeJudgeAbstract{
    public MinuteJudge(String name) {
        super(name);
    }

    @Override
    String processRequest(LocalDateTime localDateTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(localDateTime,now );
        long millis = between.toMinutes();
        if( millis<=30){
            return "30分钟";
        }else{
            return    nextJudge.processRequest(localDateTime);
        }

    }
}
