package com.bange.api.service;

import java.time.LocalDateTime;

public interface IDateTimeConvertor {
    LocalDateTime longToLocalDateTime(Long timestamp);
    String localDateTimeToString(LocalDateTime localDateTime);
    LocalDateTime StringToLocalDatetime(String datetime);

}
