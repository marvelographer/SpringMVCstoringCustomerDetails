<%@page import="com.jsp.jese8.dto.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table style="border: 2px solid red;">
		<tr style="color: red">
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>NAME</th>
			<th>PHONE NUMBER</th>
			<th>ROLE</th>
		</tr>


		<%
			EmpDto dto = (EmpDto) request.getAttribute("fetch1Obj");
		%>

		<tr style="border: 2px solid red;">
			<td><%=dto.getEmail()%></td>
			<td><%=dto.getPwd()%></td>
			<td><%=dto.getName()%></td>
			<td><%=dto.getPhone()%></td>
			<td><%=dto.getRole()%></td>
		</tr>
	</table>

</body>
</html>