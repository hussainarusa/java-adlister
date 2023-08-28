
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    Created by IntelliJ IDEA.
    User: arusah
    Date: 8/28/23
    Time: 11:40 AM
    To change this template use File | Settings | File Templates.
--%>

<%
    String submittedLogin = request.getParameter("login");
    String submittedPassword = request.getParameter("password");

    if ("admin".equals(submittedLogin) && "password".equals(submittedPassword)) {
        response.sendRedirect("profile.jsp");
    }
%>

<form method="POST" action="login.jsp">
    <input type="text" name="login" placeholder="Username">
    <input type="password" name="password" placeholder="Password">
    <button type="submit">Submit</button>
</form>

</body>
</html>
