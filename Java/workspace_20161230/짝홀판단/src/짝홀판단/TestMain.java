package ¦Ȧ�Ǵ�;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int number;
	System.out.println("���� : ");
	number = sc.nextInt();
	
	if( number %2 ==0){
		System.out.println("¦��");
	}else{
		System.out.println("Ȧ��");
	}
   }
}
