package ����̾簡;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int score;
	  System.out.println("���� : ");
	  score = sc.nextInt();
	  
	  if( score>=90 ){
		  System.out.println("��");
	  }else if( score>=80 ){
		  System.out.println("��");
	  }else if( score>=70 ){
		  System.out.println("��");
	  }else if( score>=60 ){
		  System.out.println("��");
	  }else{
		  System.out.println("��");
	  }
	  
	  switch(score/10)
	  {
	  case 10:
	  case 9:
		     System.out.println("��");
		     break;
	  case 8:
		     System.out.println("��");
	  case 7:
		     System.out.println("��");
	  case 6:
		     System.out.println("��");		     
	  case 5:
		     System.out.println("��");		     
	  }
	  
	  
	  
	}

}
