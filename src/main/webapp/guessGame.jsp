<%--
  Created by IntelliJ IDEA.
  User: rolandvaldez
  Date: 5/28/21
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<h1>Welcome to the Marco guessing game!</h1>
<p>The rules are easy just type in a number and see if it matches our number.  Limit it to a whole number between 1 and 3.</p>
<form action="/guess" method="POST">
    <label for="number">Guess a Number</label>
    <input id="number" name="number" type="text">
    <button type="submit">Lock In Your Answer</button>
</form>
</body>
</html>
