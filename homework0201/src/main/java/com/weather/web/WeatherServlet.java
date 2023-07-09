package com.weather.web;

import com.weather.domain.Weather;
import com.weather.utils.APIUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: oo-java
 * @description: ${description}
 * @author: 郭晨旭
 * @create: 2023-06-03 15:33
 * @version: 1.0
 **/

@WebServlet(name = "WeatherServlet", value = "/WeatherServlet")
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决中文乱码
        String city = request.getParameter("city");
        byte[] bytes = city.getBytes("ISO_8859_1");
        city = new String(bytes, "utf-8");
        System.out.println("city " + city);
        // 获取天气
        String id = APIUtil.city2Id(city);
        System.out.println("id " + id);
        Weather weather = null;
        if (id == null) {
            request.setAttribute("weather", weather);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        weather = APIUtil.id2Weather(id);
        weather.setCity(city);
        request.setAttribute("weather", weather);
        System.out.println("weather " + weather);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
