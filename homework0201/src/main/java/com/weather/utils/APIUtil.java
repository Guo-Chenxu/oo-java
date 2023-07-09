package com.weather.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.weather.domain.Location;
import com.weather.domain.Weather;

import java.io.IOException;
import java.net.URLEncoder;

/**
 * @program: oo-java
 * @description: api接口工具类 (和风天气)
 * @author: 郭晨旭
 * @create: 2023-06-03 14:03
 * @version: 1.0
 **/
public class APIUtil {
    /**
     * 和风天气注册的key
     */
    private static final String KEY = "";

    /**
     * 将城市字符串转换成地点id
     *
     * @param city 城市
     * @return 地点id
     */
    public static String city2Id(String city) throws IOException {
        //参数字符串，如果拼接在请求链接之后，需要对中文进行 URLEncode   字符集 UTF-8
        city = URLEncoder.encode(city, "UTF-8");
        String param = "location=" + city + "&key=" + KEY;
        //接口地址
        String url = "https://geoapi.qweather.com/v2/city/lookup?" + param;
        byte[] bytes = GZIPUtil.urlTobyte(url);
        String string = GZIPUtil.uncompressToString(bytes);
        JSONArray response = JSONObject.parseObject(string).getJSONArray("location");
        if (response == null) {
            return null;
        }
        Location l = JSON.parseObject(response.get(0).toString(), Location.class);
        return l.getId();
    }

    /**
     * 根据id请求天气
     */
    public static Weather id2Weather(String location) throws IOException {
        //参数字符串，如果拼接在请求链接之后，需要对中文进行 URLEncode   字符集 UTF-8
        String param = "location=" + location + "&key=" + KEY;
        //接口地址
        String url = "https://devapi.qweather.com/v7/weather/3d?" + param;
        byte[] bytes = GZIPUtil.urlTobyte(url);
        String string = GZIPUtil.uncompressToString(bytes);
        JSONArray response = JSONObject.parseObject(string).getJSONArray("daily");
        return JSON.parseObject(response.get(0).toString(), Weather.class);
    }
}
