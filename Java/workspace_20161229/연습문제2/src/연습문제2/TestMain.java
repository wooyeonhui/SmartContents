package 연습문제2;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
/*
 * 문제) km와 m를 입력받아서 m 로 환산하여 출력하기 
 * km : 4
 * m : 350
 * 결과 : 4350m 
 * 
 * 결과 = km * 1000 + m
 */
		int km, meter; 
		int result;    //출력변수 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("km : ");
		km = sc.nextInt();
		
		System.out.print("meter : ");
		meter = sc.nextInt();
		
		result = km*1000 + meter;
		
		System.out.printf("결과 : %d meter\n", result);
		
	}
}
