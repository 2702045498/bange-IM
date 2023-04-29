package com.bange.api.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class APPDemo {
    public static void main(String[] args) {

        //设立请求
//        LocalDateTime dateTime=LocalDateTime.now();
//        String date="2023-04-19 00:01:20";
//        String date="2023-04-25 09:01:20";
        String[] dateArr = {
                "2023-04-24 23:01:20", "2023-04-23 23:01:20", "2023-04-20 23:01:20",
                "2023-04-21 23:01:20", "2023-03-25 23:01:20", "2023-04-25 23:50:20",
                "2023-04-25 09:01:20", "2023-04-25 08:01:20", "2023-04-25 12:01:20",
                "2023-04-25 11:01:20", "2023-04-25 10:01:20", "2023-04-25 23:20:20"
                };
        for (String str : dateArr) {
            LocalDateTime dateTime = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            //流程开始
            DateJudge dateJudge = new DateJudge();
            String result = dateJudge.exectueJudge(dateTime);
            System.out.println("==>" + result);
        }

//        LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        //流程开始
//        DateJudge dateJudge = new DateJudge();
//        String result = dateJudge.exectueJudge(dateTime);
//        System.out.println("==>" + result);

    }
}
