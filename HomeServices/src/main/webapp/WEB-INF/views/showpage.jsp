<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<h1>
		<center>Welcome to Online Help Services</center>
	</h1>
	<form:form method="post" action="helpdesk" modelAttribute="helper">
		<table style="margin: 0px auto; margin-left: auto; margin-right: auto">
			 <tr>
                <td>Choose Service:</td>
				<td><select name="serviceType">
						<c:forEach var="item" items="${serviceList}">
							<option value="${item.key}">${item.value}</option>
						</c:forEach>
				</select></td>
			</tr>
			
            <tr>
                <td>Total Hours Service Required</td>
                <td><input style="width: 130px" name="noOfHours" /></td>
            </tr>
            <tr>
                <td><button type="submit" value="TotalCost">TotalCost</button></td>
                <td><button  value="cancel">Cancel</button></td>
            </tr>
		</table>
	</form:form>
 
 
</body>
</html>