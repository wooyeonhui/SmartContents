<%@ page language="java" 
    contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE> 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  out.println("<font color=red>Myhome</font>");

   String name="홍길동";
   int age = 23; 
%>
<br />
이름 : <%=name%> <br />
나이 : <%=age%> <br />

<%
for(int i=1; i<=10; i++)
{%>
  <div style="font-size:<%=20+i*2%>px">글꼴</div>
<%
}%>
</body>
</html>