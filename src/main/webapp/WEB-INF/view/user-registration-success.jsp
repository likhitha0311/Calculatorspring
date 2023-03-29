<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h1>You are successfully registered</h1>
<br></br>
<label>Details are as follows:</label>
<br></br>
Name is : ${userReg.name}<br/>

UserName is : ${userReg.username}<br/>
Password is :${userReg.password }<br/>
country is :${userReg.country }<br/>
hobbies are :

<c:forEach var="temp" items="${userReg.hobbies}">${temp} </c:forEach>
<br/>
Gender is :${userReg.gender}<br/>

</body>
</html>