<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h2 style="color: mediumblue">Registration</h2>
<form action="/reg" method="post">

    <input type="text" name="nameRegistration" placeholder="Name"/>
    <input type="text" name="ageRegistration" placeholder="Age"/>
    <input type="text" name="loginRegistration" placeholder="Login"/>
    <input type="password" name="passwordRegistration" placeholder="Password"/>
    <select name="role">
        <option>Admin</option>
        <option>Trainer</option>
        <option>Student</option>
    </select>
    <button type="submit"> Registration</button>

</form>
</body>
</html>