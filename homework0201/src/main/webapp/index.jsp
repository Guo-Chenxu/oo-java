<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--@elvariable id="weather" type="weather"--%>
<%--
  Created by IntelliJ IDEA.
  User: 郭晨旭
  Date: 2023/6/3
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>weather</title>
</head>
<body>
<div class="form-div">
    <div class="reg-content">
        <h2>当前时间为</h2>
    </div>
    <div id="datetime"></div>
    <div class="reg-content">
        <h2>查询今日天气</h2>
    </div>
    <form id="reg-form" action="/homework0201/WeatherServlet" method="get">
        <input name="city" type="text" id="city">
        <div class="buttons">
            <input value="提交查询" type="submit" id="get_btn">
        </div>
    </form>
    <div id="weather">
        <%--        ${weather}--%>
        <%--        <br/>--%>
        <%--            判断是否为空--%>
        <c:choose>
            <c:when test="${empty weather}">
                城市不存在
            </c:when>
            <c:otherwise>
                <tr>
                    <td>城市</td>
                    <td>${weather.city}</td>
                </tr>
                <br/>
                <tr>
                    <td>最高温度</td>
                    <td>${weather.tempMax}</td>
                </tr>
                <br/>
                <tr>
                    <td>最低温度</td>
                    <td>${weather.tempMin}</td>
                </tr>
                <br/>
                <tr>
                    <td>白天天气</td>
                    <td>${weather.textDay}</td>
                </tr>
                <br/>
                <tr>
                    <td>夜晚天气</td>
                    <td>${weather.textNight}</td>
                </tr>
                <br/>
                <tr>
                    <td>白天风向及风力</td>
                    <td>${weather.windDirDay}</td>
                    <td>${weather.windSpeedDay}</td>
                </tr>
                <br/>
                <tr>
                    <td>夜晚风向及风力</td>
                    <td>${weather.windDirNight}</td>
                    <td>${weather.windSpeedNight}</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </div>
</div>


</body>
<script>
    setInterval("document.getElementById('datetime').innerHTML=new Date().toLocaleString();", 0);
</script>
</html>