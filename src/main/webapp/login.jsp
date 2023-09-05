<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    if(request.getMethod().equalsIgnoreCase("POST")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin") && password.equals("password"))
            response.sendRedirect("/profile.jsp");
    }
%>
<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp"%>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>
<form class="mt-5" method="POST" action="login.jsp">
    <input type="text" name="username" placeholder="Enter Username">
    <input type="password" name="password" placeholder="Enter Password">
    <button type="submit">Submit</button>
</form>


</body>
</html>
