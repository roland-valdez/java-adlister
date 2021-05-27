<%--
  Created by IntelliJ IDEA.
  User: rolandvaldez
  Date: 5/27/21
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <%@include file="partials/head.jsp"%>

</head>
<body>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
    request.setAttribute("username", username);
    request.setAttribute("password", password);

%>
<%@include file="partials/navbar.jsp"%>
<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your username" />
    <label for="password">Password:</label>
    <input id="password" type="password" name="password" placeholder="Enter your password" />
    <button type="submit">Submit</button>
</form>

<c:choose>
    <c:when test="${username == 'admin' && password == 'password'}">
        <%
//        String site = new String("/profile.jsp");
//        response.setStatus(response.SC_MOVED_TEMPORARILY);
//        response.setHeader("Location", site);
            response.sendRedirect("/profile.jsp");
        %>

    </c:when>
</c:choose>

<%@include file="partials/bootstrap5_0_1.jsp"%>

</body>
</html>
