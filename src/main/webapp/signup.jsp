<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="insert" modelAttribute="empobject" align="center">
		<%-- passing the object --%>
		EMAIL: <form:input path="email" align="center"
			placeholder="Enter the PrimaryKey" />
		<br>
		PASSWORD: <form:input path="pwd" align="center"
			placeholder="Enter the Password" />
		<br>
		NAME: <form:input path="name" placeholder="Enter the Name"
			align="center" />
		<br>
		PHONE NUMBER: <form:input path="phone" align="center"
			placeholder="Enter the PhoneNumber" />
		<br>
		ROLE: <form:input path="role" align="center"
			placeholder="Enter the Role" />
		<br>
		<form:button align="center">INSERT</form:button>
	</form:form>
</body>
</html>