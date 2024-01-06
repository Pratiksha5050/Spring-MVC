<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
</head>
<body>

<form action="processform" method="post" modelAttribute="user">  

Username : <input type="text" name="username"/> <br><br>  
Email : <input type="text" name="email"/> <br><br>  
Password : <input type="password" name="password"/> <br><br>   
<input type="submit" value="Login"/> 
</form> 
</body>
</html>