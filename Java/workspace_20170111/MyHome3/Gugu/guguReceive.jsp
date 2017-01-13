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
String d = request.getParameter("d");
for(int i=1; i<=9; i++)
{
%>
<%=gugu%> X <%=i%> = <%i*gugu %><br/>	
<%
}
%>
</body>
</html>