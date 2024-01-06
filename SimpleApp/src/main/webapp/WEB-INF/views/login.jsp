<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<center>
		<h1>ZEE-ZEE Web Portal</h1>
		<form action="submitlogin" method="post" modelAttribute="login">
			<label for="userName">UserName:</label>
			<input type="text" id="userName" name="userName" required style="margin:0px 0px 5px 0px;"><br>
					
 			<label for="password">Password:</label>
			<input type="password" id="password" name="password" required ><br>
			
				<center style="margin:5px 520px; display:flex; justify-content:space-between">
					
						<button name="submit" type="submit">Login</button>
						
						<button name="cancle" type="button">Cancel</button>
						</center>
		</form>
	</center>
</body>
</html>
