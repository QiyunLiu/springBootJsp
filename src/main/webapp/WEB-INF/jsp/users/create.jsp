<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<title>Create a user.</title>
</head>
<body>

<form action="/users" method="POST">

First name: <input type="text" name="firstname" />
<br />
Last name: <input type="text" name="lastname" />
<br />
Address: <input type="text" name="address" />
<input type="submit"  value="Submit"/>
</form>


</body>
</html>
