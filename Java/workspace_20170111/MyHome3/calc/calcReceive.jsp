<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String x = request.getParameter("x");
String y = request.getParameter("y");
//getParameter() 는 return 값이 String만 가능
%>
x : <%=x %><br/>
y : <%=y %><br/>
<%int x1 = Integer.parseInt(x); 
  int y1 = Integer.parseInt(y);%>
x+y : <%=x1+y1%>
</body>
</html>