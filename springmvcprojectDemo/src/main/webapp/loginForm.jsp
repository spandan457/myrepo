<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>loginForm</legend>
	<form action="./login2" method="post"> 
	<!-- <form action="./login1" method="post"> -->
	<!-- <form action="./login2" method="post"> -->
	<!-- <form action="./login3" method="post"> -->
		<table>
			<tr>
				<td>Enter username</td>
				<td>:</td>
				<td> <input type="text" name="user" required="required"> </td>				
			</tr>
			<tr>
				<td>Enter password</td>
				<td>:</td>
				<td> <input type="password" name="pwd" required="required"> </td>				
			</tr>
			<tr>
				<td><input type="submit" value ="login"></td>
			</tr>
		
		</table>
	</form>
	</fieldset>

</body>
</html>