<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script>
function goSend(){
	
}
</script>
</head>
<body>
<form name="form" action="optionReceive.jsp">
    <select name="subject">
           <option value="">--선택하세요</option>
           <option value="1">HTML</option>
           <option value="2">CSS</option>
           <option value="3">JavaScript</option>
           <option value="4">Jquery</option>
           <option value="5">Java</option>      
    </select>
    
    <br>
    <input type="button" onclick="goSend()" value="제출">

</form>
</body>
</html>