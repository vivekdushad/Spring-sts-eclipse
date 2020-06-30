<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstname" />
		
		<br><br>
	
		Last name: <form:input path="lasttname" />
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>