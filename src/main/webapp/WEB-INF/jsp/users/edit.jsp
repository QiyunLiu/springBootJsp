<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit the selected user</title>
</head>
<body>
	<form action="/users/updated" method="POST">
		<table cellspacing="0">
			<tr>
				<th><label for="id">User Id: ${user.id}</label></th>
				<td><input type="hidden" value=${user.id} name ="id"/></td>
			</tr>
			<tr>
				<th><label for="firstname">first name:</label></th>
				<td><input value=${user.firstname } name="firstname" /></td>
			</tr>
			<tr>
				<th><label for="lastname">last name:</label></th>
				<td><input value=${user.lastname } name="lastname" /></td>
			</tr>
			<tr>
				<th><label for="address">Address:</label></th>
				<td><input value=${user.address } name="address" /></td>
			</tr>
		</table>
		<input type="submit" value="Update" />

	</form>
</body>
</html>

