package 스트링변수;

import java.util.Scanner;

public class TestMain {
	//main  ctrl-space
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String name;
		
		name="홍길동";
		
		name = sc.nextLine(); //한줄 쭉 읽기 
		System.out.println(name);
	}
}
