package pack;
/*
 * class 앞에 public 의 의미 누구나 다 
 * 사용가능하다 각자 다른 폴더(패키지)에 있는 
 * 클래스간에 서로 접근못함. public 쓴것만 접근 가능하다
 * 
 * 파일하나에 public 이 허용되는 클래스는 하나만 가능하고
 * 이 클래스명이 파일명과 일치해야 한다
 */
class Person
{
	private String name;
	private int age;
	
	// 특정 변수에 접근해서 값을 설정해주는 함수(메서드)를 setter라고 부르고
    // 함수명을 만드는 규칙이 있다(반드시 규칙대로 만들어야 한다)
	//함수명을 만드는 규칙
	/*1. 반환형은 꼭 void 여야 한다
	 *2. setName 함수앞에 꼭 set이라고 붙이고 변수명의 첫글자를
	 *   대문자로 나머지를 소문자로 해야하고
	 *3. 매개변수는 그 변수의 타입이어야 한다
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	//특정변수의 값을 가져가는 함수 : getter라 부른다
	//특정변수의 값을 반환 함수명은 get으로 시작 
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	public void output()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class TestMain {
	public static void main(String[] args) {
	
		Person p1 = new Person(); //객체 만들기
		
		p1.setName("홍길동");
		p1.setAge(23);
		
		p1.output();
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
	}
}
