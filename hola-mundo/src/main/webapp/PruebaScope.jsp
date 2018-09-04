<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
	<table> 
		<thead>
			<tr>
				<th>TIPO</th>
				<th>VALOR</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Request</td>
				<td>${parametro0}</td>
			</tr>
			<tr>
				<td>Session</td>
				<td>${parametro1}</td>
			</tr>
			<tr>
				<td>Application</td>
				<td>${parametro2}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>