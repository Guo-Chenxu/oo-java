package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.example.utils.GZIPUtil;

import java.io.InputStream;

/**
 * @program: oo-java
 * @description: 测试天气api
 * @author: 郭晨旭
 * @create: 2023-05-29 13:40
 * @version: 1.0
 **/


public class APIDemo01 {
    public static void main(String args[]) {
        //参数字符串，如果拼接在请求链接之后，需要对中文进行 URLEncode   字符集 UTF-8
        String location = "101010100";
        String param = "location=" + location + "&key=a101496e2c0c496ba609ddf87b2c04da";
        InputStream is = null;
        try {
            //接口地址
            String url = "https://devapi.qweather.com/v7/weather/3d?" + param;
            byte[] bytes = GZIPUtil.urlTobyte(url);
            String string = GZIPUtil.uncompressToString(bytes);
            JSONArray response = JSONObject.parseObject(string).getJSONArray("daily");
            Weather weather = JSON.parseObject(response.get(0).toString(), Weather.class);
            System.out.println(weather);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
