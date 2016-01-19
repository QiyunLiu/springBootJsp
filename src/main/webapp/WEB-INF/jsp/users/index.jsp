<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<title>get the users....</title>
</head>
<body>


<table> <caption>List of users</caption>
	<thead> 
		<tr> 
		<th>ID</th> 
	 		<th>first name</th> 
	 		<th>last name</th> 
	 		<th>address</th> 
	 			 	</tr> 
	 </thead> 
 	<c:forEach items="${users}" var="user" >
    	<tr><td>${user.id}</td>  
    		<td>${user.firstname}</td>  
    		<td>${user.lastname}</td>  
    		<td>${user.address}</td>  
    		<td><input type="button" onclick="location.href='/users/edit/${user.id}'"  value="edit"/></td>
    		<td><input type="button" onclick="location.href='/users/delete/${user.id}'"  value="delete"/></td>
    	</tr>  
    	
  	</c:forEach>
</table>

<input type="button" onclick="location.href='/users/newuser'"  value="create a new user."/>
</body>
</html>
