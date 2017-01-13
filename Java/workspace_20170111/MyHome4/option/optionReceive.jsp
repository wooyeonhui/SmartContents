<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String subject = request.getParameter("subject");

//if( subject.equals("1"))
//	out.print("HTML을 선택했습니다.");
//if( subject.equals("2"))
//	out.print("CSS를 선택했습니다.");
//if( subject.equals("3"))
//	out.print("JavaScript를 선택했습니다.");
//if( subject.equals("4"))
//	out.print("Jquery를 선택했습니다.");
//if( subject.equals("5"))
//	out.print("Java를 선택했습니다.");
if(subject==null||subject.equals(""))
	out.println("선택안함");
else
{
	String []subjects = new String[]{"java","html","css","javascript","jquery"};
	int sel =Integer.parseInt(subject);
	out.println(subjects[sel-1]);
}
%>
</body>
</html>