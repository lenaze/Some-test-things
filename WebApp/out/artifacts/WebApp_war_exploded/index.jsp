<%--
  Created by IntelliJ IDEA.
  User: Lena
  Date: 10.04.2020
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Привет от Лены</title>
</head>
<body>
<%
    String s = "Вся власть студентам!";
    for(int i=0; i<10; i++)
    {
        out.println(s);
        out.println("<br>");
    }
%>
</body>
</html>