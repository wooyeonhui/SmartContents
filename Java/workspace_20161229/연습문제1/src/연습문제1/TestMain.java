package 연습문제1;

import java.util.Scanner;

public class TestMain {
	/*
	 * 1.입력변수정의
	 * 2.출력변수정의
	 * 3.입력
	 * 4.계산
	 * 5.출력
	 */

	public static void main(String[] args) {
		int input;
		int km, meter;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("meter : ");
		input = sc.nextInt();
		
		km = input / 1000;
		meter = input % 1000;
		
		System.out.printf("%d meter 는 %dkm %dm 입니다\n",
				input, km, meter);
	}
}

/*
 * 문제) km와 m를 입력받아서 m 로 환산하여 출력하기 
 * km : 4
 * m : 350
 * 결과 : 4350m 
 * 
 * 결과 = km * 1000 + m
 */



