
<%--
  Created by IntelliJ IDEA.
  User: rolandvaldez
  Date: 6/1/21
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listing</title>
</head>
<body>
<main>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>${ad.title}</h2>
            <h5>${ad.description}</h5>
        </div>
    </c:forEach>
</main>

</body>
</html>
