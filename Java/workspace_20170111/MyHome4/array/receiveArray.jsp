<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script>
//function getHtml(){
//document.getElementByValue("sports").html;
//}
</script>
</head>
<body>
<% 
//배열의 경우에는 request.getParameterValues로 받아야 한다
 String []sports = request.getParameterValues("sports");
 String result=""; 
for(int i=0; i<sports.length; i++)
{
	if( sports[i].equals("1"))
		result = result + "야구";
    if( sports[i].equals("2"))
    	result = result + "축구";
    if( sports[i].equals("3"))
    	result = result + "농구";
    if( sports[i].equals("4"))
    	result = result + "피겨";
    if( sports[i].equals("5")
    	result = result + "골프";
    if( sports[i].equals("6"))
    	result = result + "수영";
    if( sports[i].equals("7"))
    	result = result + "육상";
    if( sports[i].equals("8"))
    	result = result + "양궁";
    if( sports[i].equals("9"))
    	result = result + "체조";
    if( sports[i].equals("10"))
    	result = result + "쇼트트랙";
    
}
%>
<%=result %>
<br/>
<%
String []sportsName=new String[]{"야구","축구","농구","피겨","골프","수영",
	"육상","양궁","체조","쇼트트랙"};
for(int i=0; i<sports.length;i++)
{
	//String 타입으로 1 2 3 이런식으로 넘어오니까
	//이걸 정수로 바꾼다
	int index = Integer.parseInt(sports[i]);
	out.print(sportsName[index-1] + "<br/>");
	}
%>

</body>
</html>