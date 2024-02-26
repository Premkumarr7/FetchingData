<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>Add Student: </h3>
		<form action="addStudent">
			Number sid : <input type="text" name="sid"><br>
			Number sname : <input type="text" name="sname"><br>
			Number tech : <input type="text" name="tech"><br>
			<input type="submit"><br>
		</form>
		<h3>Get Student: </h3>
		<form action="getStduent">
			Number sid : <input type="text" name="sid"><br>
			<input type="submit"><br>
		</form>
		<h3>Delete Student: </h3>
		<form action="deleteStduent">
			Number sid : <input type="text" name="sid"><br>
			<input type="submit"><br>
		</form>
</body>
</html>