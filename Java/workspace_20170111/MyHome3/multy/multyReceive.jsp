<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String x = request.getParameter("x");
%>
<%=x %><span>단 생성</span>
<% int Nx = Integer.parseInt(x);
%>
<br/>
------------------------------
<br/>
<%
for(int i=1; i<10; i++)
	out.print(Nx + " x "+i +" : "+ Nx*i+"<br/>");
	%> 
	

</body>
</html>