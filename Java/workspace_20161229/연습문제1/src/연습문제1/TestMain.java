package ��������1;

import java.util.Scanner;

public class TestMain {
	/*
	 * 1.�Էº�������
	 * 2.��º�������
	 * 3.�Է�
	 * 4.���
	 * 5.���
	 */

	public static void main(String[] args) {
		int input;
		int km, meter;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("meter : ");
		input = sc.nextInt();
		
		km = input / 1000;
		meter = input % 1000;
		
		System.out.printf("%d meter �� %dkm %dm �Դϴ�\n",
				input, km, meter);
	}
}

/*
 * ����) km�� m�� �Է¹޾Ƽ� m �� ȯ���Ͽ� ����ϱ� 
 * km : 4
 * m : 350
 * ��� : 4350m 
 * 
 * ��� = km * 1000 + m
 */



