package ��������2;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
/*
 * ����) km�� m�� �Է¹޾Ƽ� m �� ȯ���Ͽ� ����ϱ� 
 * km : 4
 * m : 350
 * ��� : 4350m 
 * 
 * ��� = km * 1000 + m
 */
		int km, meter; 
		int result;    //��º��� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("km : ");
		km = sc.nextInt();
		
		System.out.print("meter : ");
		meter = sc.nextInt();
		
		result = km*1000 + meter;
		
		System.out.printf("��� : %d meter\n", result);
		
	}
}
