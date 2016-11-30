<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Form Validation with Spring 3 MVC and Hibernate Validation</title>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
	</head>
	<body>
		<h1>Registration Form</h1><br />
		<form:form commandName="Registration">
		<table>
			<tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
			<tr><td>Name : </td><td><form:input path="name" /></td></tr>
			<tr><td>Username : </td><td><form:input path="username" /></td></tr>
			<tr><td>Email : </td><td><form:input path="email" /></td></tr>
			<tr><td>Phone : </td><td><form:input path="phone" /></td></tr>
			<tr><td>Password : </td><td><form:password path="password" /></td></tr>
			<tr><td>Retype Password : </td><td><form:password path="rePassword" /></td></tr>
			<tr><td colspan="2"><input type="submit" value="Register" /></td></tr>
		</table>
		</form:form>
	</body>
</html>