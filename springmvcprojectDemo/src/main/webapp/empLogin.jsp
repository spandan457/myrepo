<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
	<fieldset>
	<legend>Employee login</legend>
	<form action="./empLogin" method="post"> 
		<table>
			<tr>
				<td>Enter id</td>
				<td>:</td>
				<td> <input type="text" name="id" required="required"> </td>				
			</tr>
			<tr>
				<td>Enter password</td>
				<td>:</td>
				<td> <input type="password" name="pwd" required="required"> </td>				
			</tr>
			<tr>
				<td><input type="submit" value="login"></td>
			</tr>
		
		</table>
	</form>
	</fieldset>

</body>
</html>