package ����ó��;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
	   String name;
	   int kor, eng, mat;
	   int total;
	   float avg;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("�̸� : ");
	   name = sc.nextLine();
	   System.out.println("���� : ");
	   kor = sc.nextInt();
	   System.out.println("���� : ");
	   eng = sc.nextInt();
	   System.out.println("���� : ");
	   mat = sc.nextInt();
	   
	   total = kor + eng + mat;
	   avg = total/3.0f; //3.0f �� �ؾ� �Ҽ������� �����Ͱ� ���´�
			   
	   System.out.printf("%s %d %.2f\n", name, total, avg);
	   
   }
}
