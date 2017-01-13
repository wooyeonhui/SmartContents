<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script>
//  function goSend()
//  {
//	  var frm = document.form;
//	  if(frm.sports.value=="")
//		  {
//		  alert("종목을 선택하세요!!")
//		  frm.sports.focus();
//		  return false;
//		  }
//	  frm.sumit();
// }
</script>
</head>
<body>
<form name="form" action="receiveArray.jsp">
  <span>좋아하는 운동종목은?</span><br/>
 <input type="checkbox" name="sports" value="1">야구<br/>
 <input type="checkbox" name="sports" value="2">축구<br/>
 <input type="checkbox" name="sports" value="3">농구<br/>
 <input type="checkbox" name="sports" value="4">피겨<br/>
 <input type="checkbox" name="sports" value="5">골프<br/>
 <input type="checkbox" name="sports" value="6">수영<br/>
 <input type="checkbox" name="sports" value="7">육상<br/>
 <input type="checkbox" name="sports" value="8">양궁<br/>
 <input type="checkbox" name="sports" value="9">체조<br/>
 <input type="checkbox" name="sports" value="10">쇼트트랙<br/>

  <input type="submit" onclick="goSend()" value="보내기!">
</form>
</body>
</html>