package com.weather.domain;

import lombok.Data;

/**
 * @program: oo-java
 * @description: 天气实体类
 * @author: 郭晨旭
 * @create: 2023-06-03 14:09
 * @version: 1.0
 **/

@Data
public class Weather {
    private String city;
    private String moonset;
    private String windSpeedDay;
    private String sunrise;
    private String moonPhaseIcon;
    private String windScaleDay;
    private String windScaleNight;
    private String wind360Day;
    private String iconDay;
    private String wind360Night;
    private String tempMax;
    private String cloud;
    private String textDay;
    private String precip;
    private String textNight;
    private String humidity;
    private String moonPhase;
    private String windDirDay;
    private String windDirNight;
    private String vis;
    private String fxDate;
    private String moonrise;
    private String pressure;
    private String iconNight;
    private String sunset;
    private String windSpeedNight;
    private String uvIndex;
    private String tempMin;
}
