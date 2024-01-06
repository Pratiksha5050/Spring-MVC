<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>

<mvc:resources mapping="/resources/**" location="/resources/" />
<link href="${styling}" rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="SIcalculator" method="post"  >
<div class="button-container" style="float:left;clear:right">
<header class="text-center">Simple Interest Calculator</header>
Principal Amount : <input type="text" name="principal"/> <br><br>  
No. of Years : <input type="text" name="year"/> <br><br>   
Rate of Interest : <input type="text" name="rate"/> <br><br> 
<input type="submit" name="Calculate Simple Interest"/> 
</div>
</form:form> 
</body>
</html>