<%--
  Created by IntelliJ IDEA.
  User: rolandvaldez
  Date: 5/30/21
  Time: 11:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<main>
    <h1>Pizza Order Form</h1>
    <form action="/PizzaOrder.jsp.jsp" method="POST">

        <select>
            <option selected>Select crust type</option>
            <option value="thin">Thin Crust</option>
            <option value="hand">Hand Tossed</option>
            <option value="pan">Pan Pizza</option>
        </select>
        <select>
            <option selected>Select sauce type</option>
            <option value="marinara">Marinara</option>
            <option value="alfredo">Alfredo</option>
            <option value="spicy">Spicy Marinara</option>
        </select>
        <select>
            <option selected>Select size</option>
            <option value="personal">Personal</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <h5>Select Toppings</h5>
        <div>
            <label for="pepperoni">Pepperoni</label>
            <input type="checkbox" id="pepperoni" value="pep" >
        </div>
        <div>
            <label for="mushrooms">Mushrooms</label>
            <input type="checkbox" id="mushrooms" value="mush" >
        </div>
        <div>
            <label for="cheese">Cheese</label>
            <input type="checkbox" id="cheese" value="chee" >
        </div>
        <label for="address" >Delivery Address:</label>
        <input id="address" name="address" type="text">
        <button type="submit">Place Order</button>
    </form>
</main>

</body>
</html>
