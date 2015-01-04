<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mGTD</title>
</head>
<body>

	<h1>mGTD : List Entries. </h1>
	<h2>[mteng] result : ${result}</h2>
	<h2>[mteng] Total documents : ${counter}</h2>
 	<h2>[mteng] resultingArrayList : </h2>

	<c:forEach items="${resultArrayList}" var="item">
		<tr> <td><c:out value="${item}"/><br/></td> </tr>
	</c:forEach>

</body>
</html>