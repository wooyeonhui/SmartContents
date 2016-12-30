package Â¦È¦ÆÇ´Ü;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int number;
	System.out.println("Á¤¼ö : ");
	number = sc.nextInt();
	
	if( number %2 ==0){
		System.out.println("Â¦¼ö");
	}else{
		System.out.println("È¦¼ö");
	}
   }
}
