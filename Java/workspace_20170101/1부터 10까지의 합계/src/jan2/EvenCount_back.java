package jan2;

import java.util.Scanner;

public class EvenCount_back {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int i;
	int number;
	int even_sum, even_cnt;
	int odd_sum, odd_cnt;
	
	even_sum=0; even_cnt=0;
	odd_sum=0; odd_cnt=0;
	for(i=1; i<=10; i++)
	{
		System.out.printf("정수 %d : ",i);
		number = sc.nextInt();
		if( number %2 ==0 )//짝수일 경우
		{
			even_sum+=number;
			even_cnt++;
		}
		else
		{
			odd_sum+=number;
			odd_cnt++;
		}
	}
	
}
}
