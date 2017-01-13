<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
/*서버로 전달되어 온 정보 처리하기
* JSP에서 request 라는 객체를 만들어줌
* request.getParameter를 이용해 정보를 읽는다
*/
String userid = request.getParameter("userid");
String password = request.getParameter("password");
%>
아이디 : <%=userid %><br/>
패스워드 : <%=password %><br/>
</body>
</html>