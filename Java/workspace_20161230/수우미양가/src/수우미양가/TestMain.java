package 수우미양가;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int score;
	  System.out.println("점수 : ");
	  score = sc.nextInt();
	  
	  if( score>=90 ){
		  System.out.println("수");
	  }else if( score>=80 ){
		  System.out.println("우");
	  }else if( score>=70 ){
		  System.out.println("미");
	  }else if( score>=60 ){
		  System.out.println("양");
	  }else{
		  System.out.println("가");
	  }
	  
	  switch(score/10)
	  {
	  case 10:
	  case 9:
		     System.out.println("수");
		     break;
	  case 8:
		     System.out.println("우");
	  case 7:
		     System.out.println("미");
	  case 6:
		     System.out.println("양");		     
	  case 5:
		     System.out.println("가");		     
	  }
	  
	  
	  
	}

}
