package com.bange.api.util;

import java.time.Duration;
import java.time.LocalDateTime;

public class SecondJudge extends TimeJudgeAbstract {
    public SecondJudge(String name) {
        super(name);
    }

    @Override
    String processRequest(LocalDateTime localDateTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(localDateTime, now);
        long millis = between.toMillis();
        if ( millis <= 60000) {
            return "刚刚";
        } else {
            return  nextJudge.processRequest(localDateTime);
        }

    }
}
