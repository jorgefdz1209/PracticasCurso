<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hola mundo JSP!!!<br>
	<% for(int i=0; i<10; i++){ %>
		Index del contador <%=i %><br>
	<%} %>
	<% List<String> cabeceras = new ArrayList<>();  
		cabeceras.add("Nombre");
		cabeceras.add("Apellido");
		cabeceras.add("Fecha de nacimiento");
	%>
	<table> 
		<thead>
			<tr>
			<% for(String s : cabeceras){ %>
				<th><%=s %></th>
			<%} %>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td></td>
			</tr>
		</tbody>
	</table>
</body>
</html>