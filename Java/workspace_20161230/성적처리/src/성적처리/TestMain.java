package 성적처리;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
	   String name;
	   int kor, eng, mat;
	   int total;
	   float avg;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("이름 : ");
	   name = sc.nextLine();
	   System.out.println("국어 : ");
	   kor = sc.nextInt();
	   System.out.println("영어 : ");
	   eng = sc.nextInt();
	   System.out.println("수학 : ");
	   mat = sc.nextInt();
	   
	   total = kor + eng + mat;
	   avg = total/3.0f; //3.0f 로 해야 소숫점이하 데이터가 나온다
			   
	   System.out.printf("%s %d %.2f\n", name, total, avg);
	   
   }
}
