package StringClass;

import java.util.Scanner;

public class TestMain {
 public static void main(String[] args) {
	 String s1 = "String";//예외적인 상황이다
	 String s2 = new String("String");
	 String s3 = new String();
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 
	 System.out.println(s1.charAt(0));
	 System.out.println(s1.charAt(1));
	 System.out.println(s1.charAt(2));
	 System.out.println(s1.charAt(3));
	 System.out.println(s1.charAt(4));
	 System.out.println(s1.charAt(5));
//	 System.out.println(s1.charAt(6));
	 
	 //문자열의 길이 알아내기
	 System.out.println(s1.length());
	 
	 s3="124";
	 int a = Integer.parseInt(s3);//String --> int로 전
	 
	 System.out.println(s3);

	 s3 = String.valueOf(a);//int --> String으로 전환
	 System.out.println(s3.toString());
	 System.out.println(Integer.toString(123));
	 
	 char []buffer={'b','i','g'};
	 s3 = new String(buffer);
	 
	 s1="java";
	 s2="객체지향";
	 
	 s3 = s1.concat(s2); //s3 = s1 + s2;
	 
	 System.out.println(s3);
	 
	 //문자열을 추출하기
	 s1 = "2017-01-06";
	 
	 String year = s1.substring(0, 4); //0~3까지 추출하기
	 System.out.println("연도 : "+ year);
	 
	 String month = s1.substring(5,7); //5,6추출하기
	 
	 String day = s1.substring(8,10); //5,6추출하기
			 
	 System.out.println(month);
	 System.out.println(day);
	 
	 s1="키위,자몽,참외,사과,오렌지,귤,복숭아,앵두,자두";
	 
	 String []fruits = s1.split(",");
	 //,를 기준으로 문자열을 잘라라
	 
	for(int i=0; i<fruits.length; i++)
	{
		System.out.println(fruits[i]);
	}
	 
	s1=" 키 위  ";
	System.out.println("*"+s1+"*");
	System.out.println("*"+s1.trim()+"*");//중간 띄어쓰기는 어쩔 수 없다
	
	s1="korea";
	System.out.println(s1.toUpperCase());
	
	s1="PRESIDENT";
	System.out.println(s1.toLowerCase());

	//문자가 있는곳의 위치를 반환하는 함수 indexOf함수
	int pos = s1.indexOf('R');
	System.out.println(pos);
	
	pos = s1.indexOf('A');
	System.out.println(pos);
	//없는 문자를 찾을 경우 -1을 반환한다.
	
	pos = s1.lastIndexOf('A');
	System.out.println(pos);
	
	pos = s1.lastIndexOf('E');
	System.out.println(pos);
	
	//E가 있는 곳을 다 찾아 출력하고 싶다
	pos = s1.indexOf('E');
	while(pos!=-1)
	{
		System.out.println(pos);
		pos = s1.indexOf('E',pos+1); // 그 다음위치에서 겁색하기
	}
	
	s1 = "문자열 내에 파라미터로";
	System.out.println(s1.contains("파라"));
	
	//문자열 바꾸기 기능
	s1 = s1.replace("파라미터", "매개변수");
	System.out.println(s1);
	
	s1="우연희";
	s2="우연희";
	
	s1 = new String("서당");
	s2 = new String("학교");
	
	if( s1.equals(s2))
	{
		System.out.println("같다");
	}
	else
	{
		System.out.println("다르다");
	}
	
	/*
	 * CompareTo - 반환값이 음수, 0, 양수 세개임
	 * 두개의 문자열을 비교하여 앞의 문자열이 사전순서상 뒤쪽이면
	 * 1, 작으면 -1 같으면 0을 반환
	 */
	
	s1 = "서당";
	s2 = "학교";
	//if( s1.compareTo(s2)==0) s1.equals(s2)
	
	if( s1.compareTo(s2)<0)
		System.out.println("s1이 작다");
	else if(s1.compareTo(s2)>0)
		System.out.println("s1이 크다");
	else
		System.out.println("둘다 같다");
} 
}
