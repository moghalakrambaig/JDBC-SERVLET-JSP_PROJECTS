<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username = (String) session.getAttribute("user_name");
%>
	<h2>HomePage</h2><br>
	<p>Hello <%=username %> This is Home page!</p>
	<a href="myprofile.jsp">My Profile</a>
</body>
</html>