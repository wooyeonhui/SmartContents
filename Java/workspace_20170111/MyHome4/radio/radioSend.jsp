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
 <span>����? </span><br>
 <input type="radio" name="gender" value="M">
  ���� &nbsp;&nbsp;&nbsp;
  <input type="radio" name="gender" value="W">
  ����&nbsp;&nbsp;&nbsp;
  <br>
  <input type="radio" name="age" value="1"> 10��
  <input type="radio" name="age" value="2"> 20��
  <input type="radio" name="age" value="3"> 30��
  <input type="radio" name="age" value="4"> 40�� 
  <input type="radio" name="age" value="5"> 50��
  <input type="radio" name="age" value="6"> 60��
<br/>
<input type="submit" value="�����ϱ�">
  <!--  radio�� �������� �ϳ��� �����ϵ��� �ؾ��Ѵ�.
  �׷��� �׷��� ��������� �Ѵ�
  ���� �׷��� name ���� ���ƾ� �Ѵ� -->
</form>
</body>
</html>