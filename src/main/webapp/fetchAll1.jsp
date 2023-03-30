<%@page import="com.jsp.jese8.dto.EmpDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table style="border: 2px solid blue;">
		<tr style="color: red;">
			<th>EMAIL</th>
			<th>PASSWORD</th>
			<th>NAME</th>
			<th>PHONE NUMBER</th>
			<th>ROLE</th>
		</tr>
		<%
			List<EmpDto> list = (List<EmpDto>) request.getAttribute("fetchAllKey");
			for (EmpDto a : list) {
		%>
		<tr style="color: black;">
			<td><%=a.getEmail()%></td>
			<td><%=a.getPwd()%></td>
			<td><%=a.getName()%></td>
			<td><%=a.getPhone()%></td>
			<td><%=a.getRole()%></td>
			<%
				}
			%>
		
	</table>

</body>
</html>