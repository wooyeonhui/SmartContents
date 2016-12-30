package 사칙연산;

import java.util.Scanner;

/*
 * 정수 두개를 입력받아 더하기 빼기 곱하기 나누기 나머지
 */
public class TestMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;	
		System.out.print("정수 1 : ");
		x = sc.nextInt();
		
		System.out.print("정수 2 : ");
		y = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", x,y,x+y);
		System.out.printf("%d - %d = %d\n", x,y,x-y);
		System.out.printf("%d * %d = %d\n", x,y,x*y);
		System.out.printf("%d / %d = %d\n", x,y,x/y);
		System.out.printf("%d %% %d = %d\n", x,y,x%y);
	}
}



