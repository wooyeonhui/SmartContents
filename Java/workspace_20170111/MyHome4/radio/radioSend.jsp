<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form name="form" action="radioReceive.jsp">
 <span>성별? </span><br>
 <input type="radio" name="gender" value="M">
  남자 &nbsp;&nbsp;&nbsp;
  <input type="radio" name="gender" value="W">
  여자&nbsp;&nbsp;&nbsp;
  <br>
  <input type="radio" name="age" value="1"> 10대
  <input type="radio" name="age" value="2"> 20대
  <input type="radio" name="age" value="3"> 30대
  <input type="radio" name="age" value="4"> 40대 
  <input type="radio" name="age" value="5"> 50대
  <input type="radio" name="age" value="6"> 60대
<br/>
<input type="submit" value="선택하기">
  <!--  radio는 여러개중 하나만 선택하도록 해야한다.
  그래서 그룹을 지정해줘야 한다
  같은 그룹은 name 값이 같아야 한다 -->
</form>
</body>
</html>