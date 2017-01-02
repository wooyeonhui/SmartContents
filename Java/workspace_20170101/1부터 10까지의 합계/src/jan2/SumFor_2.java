package jan2;

import java.util.Scanner;

public class SumFor_2 {

	public static void main(String[] args) {
		/*
		 * 정수 10개를 입력받아서 짝수와 홀수의 평균을 구하기 
		 * 짝수만 10개가 들어올 수 도 있고 홀수만 10이 들어올 수 도있다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int getNumber=0;//입력 받는 변수
		int EvenSum=0;//짝수 합
		int EvenN=0;//짝수 갯수
		int EvenAvg;
        int OddSum=0;//홀수 합
        int OddN=0;//홀수 갯수
        int OddAvg;
        int i;
        
        for(i=1; i<=10; i++)
        {
        	System.out.println(i+"번째 정수 입력 : ");
        	getNumber = sc.nextInt();
        	if( getNumber % 2 ==0 )
        	{
        		EvenSum += getNumber;
        		EvenN++;       		
        	}
        	else
        	{
        		OddSum += getNumber;
        		OddN++;
        	}        	
        }
        EvenAvg = EvenSum/EvenN;
        OddAvg = OddSum/OddN;
        if( EvenN == 0 )
        {
        	EvenAvg = 0000;
        
        }else if( OddN == 0 )
        {
        	OddAvg = 0000;
        }
        
        System.out.printf("짝수의 평균 %-2d",EvenAvg);
        System.out.printf("홀수의 평균 %-2d",OddAvg);

	}

}
