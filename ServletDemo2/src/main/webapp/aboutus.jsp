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
	String myname = (String) session.getAttribute("name_key");
%>
	<h2>Hello: <%=myname %></h2>
	
	<a href="profile.jsp">Profile</a>
</body>
</html>