<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Average Salary </title>
</head>
<body>
<h2 style="color: mediumblue">Answer about trainer average salary</h2>
<label>Average salary of trainer ${trainerWithHisAverageSalary.name} is ${trainerWithHisAverageSalary.averageSalary}</label><br>
</body>
<a href="/getAdminMainPage">Main page</a><br>
<a href="/logout">Logout</a>
</html>
