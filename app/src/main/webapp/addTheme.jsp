<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add New Theme</title>
</head>
<body>
<h2 style="color: mediumblue">Add New Theme</h2>
<form action="addTheme" method="post">
    <input type="text" name="themeName" placeholder="Theme name"/>
    <button type="submit">Submit</button>
</form>
<a href="mainTrainer.jsp">Main page</a><br>
<a href="/logout">Logout</a>
</body>
</html>
