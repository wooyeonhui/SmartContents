<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String gender=request.getParameter("gender");
//String []age=request.getParameterValues("age");
String age=request.getParameter("age");
%>
<br>
<% 
if( gender.equals("M"))
{
	out.print("남자");
}else
{
	out.print("여자<br>");
}
out.println(age+"0대<br>");%>
<% 
//String []age1=new String[]{"10","20","30","40","50","60"};
//for(int i=0; i<age.length; i++){
//	int index = Integer.parseInt(age[i]);
//	out.print(age1[index-1]+"<br>");
//}
%>
</body>
</html>