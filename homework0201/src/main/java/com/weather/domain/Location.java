package com.weather.domain;

import lombok.Data;

/**
 * @program: oo-java
 * @description: 地点信息类
 * @author: 郭晨旭
 * @create: 2023-06-03 13:57
 * @version: 1.0
 **/

@Data
public class Location {
    private String country;
    private String fxLink;
    private String utcOffset;
    private String adm2;
    private String tz;
    private String isDst;
    private String lon;
    private String adm1;
    private String type;
    private String name;
    private String rank;
    private String id;
    private String lat;
}
