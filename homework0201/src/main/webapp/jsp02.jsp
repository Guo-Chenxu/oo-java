<%--
  Created by IntelliJ IDEA.
  User: 郭晨旭
  Date: 2023/5/29
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp动态显示时间</title>
</head>
<body>
</body>
<div id="datetime">
    <script>
        setInterval("document.getElementById('datetime').innerHTML='当前时间为: ' + new Date().toLocaleString();", 1000);
    </script>
</div>
</html>
