<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>

<body>
<h1>Calculator Registration Form</h1>
<div align="center">
<form:form action="registration-success" modelAttribute="userReg" >
<label>Name:</label>
<form:input path="name"/>
<br></br>
<label>UserName:</label>
<form:input path="username"/>
<br></br>
<label>Password:</label>
<form:input path="password"/>
<br></br>
Country :<form:select path="country">
<form:option value="Ind" label="India"></form:option>
<form:option value="UK" label="Uniked Kingdom"></form:option>
<form:option value="US" label="United States"></form:option>
<form:option value="CH" label="China"></form:option>
</form:select>
<br></br>

<label>Hobbies</label>
Travel:<form:checkbox path="hobbies" value="Travel"/>
Read:<form:checkbox path="hobbies" value="Read"/>
Music:<form:checkbox path="hobbies" value="Music"/>
<br></br>

<label>Gender</label>
Male:<form:radiobutton path="gender" value="Male"/>
Female:<form:radiobutton path="gender" value="Female"/>

<input type="submit" value="Register"/>
</form:form>
</div>
</body>
</html>