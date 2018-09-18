<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba JSP</title>
</head>
<body>
	<div>
		<table>
		<thead>
			<tr>
				<td>Scopes </td>
				<td>Valor</td>
			</tr>
			<tr>
				<td>request </td>
				<td>${parametro} </td>
			</tr>
			<tr>
				<td>session </td>
				<td>${parametro1} </td>
			</tr>
			<tr>
				<td>application</td>
				<td>${parametro2} </td>
			</tr>
			
		</thead>
	</table>
	</div>
	
	
	<style>
		
		div{
		margin: 150px auto;
		width: 600px;
				}
		table{
		text-align: center;
		border-collapse: collapse;
		width: 100%;
		}
		td{
		padding: 20px;
		}
		
		
	</style>

</body>
</html>