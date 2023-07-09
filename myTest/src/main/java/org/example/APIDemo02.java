package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.example.utils.GZIPUtil;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @program: oo-java
 * @description: 测试地理api
 * @author: 郭晨旭
 * @create: 2023-05-29 14:07
 * @version: 1.0
 **/
public class APIDemo02 {
    public static void main(String args[]) throws UnsupportedEncodingException {
        //参数字符串，如果拼接在请求链接之后，需要对中文进行 URLEncode   字符集 UTF-8
        String location = "一个不存在的地名";
        location = URLEncoder.encode(location, "UTF-8");
        String param = "location=" + location + "&key=a101496e2c0c496ba609ddf87b2c04da";
        try {
            //接口地址
            String url = "https://geoapi.qweather.com/v2/city/lookup?" + param;
            byte[] bytes = GZIPUtil.urlTobyte(url);
            String string = GZIPUtil.uncompressToString(bytes);
            JSONArray response = JSONObject.parseObject(string).getJSONArray("location");
            System.out.println(response);
            Location l = JSON.parseObject(response.get(0).toString(), Location.class);
            System.out.println(l.getId());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
