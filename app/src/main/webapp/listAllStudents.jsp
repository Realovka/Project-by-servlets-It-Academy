<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Students</title>
</head>
<body>
<h2 style="color: mediumblue">List All Students in the University</h2>
<form action="/addStudent" method="post">
    <c:choose>
        <c:when test="${sessionScope.students.size()>0}">
            <label>If you want to add his to your list, click on student name</label><br>
            <c:forEach items="${sessionScope.students}" var="student">
                <a href="<c:url value="/addStudent"/>?studentId=${student.id}">${student.userName}</a><br>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <label>All students from University are in your group</label>
        </c:otherwise>
    </c:choose>
</form>

<c:if test="${sessionScope.userAuth.group.students.size()>0}">
    <table border="3">
        <thead>
        <th align="center">Students name in Your Group</th>
        </thead>
        <c:forEach items="${sessionScope.userAuth.group.students}" var="student">
            <tr>
                <td>${student.userName}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<a href="mainTrainer.jsp">Main page</a><br>
<a href="/logout">Logout</a>
</body>
</html>
