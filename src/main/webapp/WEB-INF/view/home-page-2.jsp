<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<div align="center">
<h1 align="center">Calculator</h1>
<form action="process-homepage-2">
<label for="un">Your name:</label>
<input type="text" id="un" name="username" >${username}</>
<br></br>
<label for="fn">Friend name:</label>
<input type="text" id="fn" name="friendname"> ${friendname}</>
<br></br>
<input type="submit" value="Calculate"/>
</form>
</div>
</body>
</html>