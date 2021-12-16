<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC App</title>
</head>
<body>
	Liste App : ${nbApp}
	<table>
		<c:forEach items="${listeApplications}" var="app">
			<tr>
				<td>${app.id}</td>
				<td>${app.name}</td>
				<td>${app.description}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>