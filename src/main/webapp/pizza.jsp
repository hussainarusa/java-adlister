<%--
  Created by IntelliJ IDEA.
  User: arusah
  Date: 8/29/23
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--This form features choices to select the crust type, sauce type,
size type (use select inputs), toppings (checkboxes), and delivery
address (text input). Use System.out.println to output the values
submitted by the user.--%>
    <div id="wrapper">
        <div id="inputs">
            <div>
               <form action="pizza" method="post">
                    <h1>Order</h1>
                    Address:<input type="text" name="adress" placeholder="1234 Street City, ST Zip">
                    <br/>
                   <p>Pizza Crust</p>

                   <label for="thick-checkbox">Thick</label>
                   <input id="thick-checkbox" type='checkbox' name="crust" value="Thick" >

                   <label for="thin-checkbox">Thin</label>
                   <input id="thin-checkbox" type='checkbox' name="crust" value="Thin" >

                   <p>Pizza Sauce</p>

                   <label for="marinara-checkbox">Marinara</label>
                   <input id="marinara-checkbox" type='checkbox' name="sauce" value="Marinara" >

                   <label for="pesto-checkbox">Pesto</label>
                   <input id="pesto-checkbox" type='checkbox' name="sauce" value="Pesto" >

                    <p>Pizza toppings (Check all that apply)</p>

                   <label for="mushroom-checkbox">Mushroom</label>
                   <input id="mushroom-checkbox" type='checkbox' name="topping" value="Mushroom" >

                   <label for="pepperoni-checkbox">Pepperoni</label>
                   <input id="pepperoni-checkbox" type='checkbox' name="topping" value="Pepperoni" >

                   <button type="submit">Submit</button>

                </form>
            </div>
        </div>
        <link rel="stylesheet" type="text/css" href="pizza.css">
    </body>
</html>
