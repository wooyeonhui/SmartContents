package jan3;

import java.util.Scanner;

public class Array_1D_Avg {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []arr;
	int i;
	double avg;
	
	arr = new int[10];
	
	//1. 입력
	for(i=0; i<10; i++)
	{
		System.out.printf("점수[%d] : ",i+1);
		arr[i] = sc.nextInt();
	}
    
	//2. 평균계산
	int sum=0;
	for(i=0; i<10; i++)
	{
		sum += arr[i];
	}
	avg = sum/10.0;
	
	//3. 출력하기
	for(i=0; i<10;i++)
	{
		System.out.printf("%4d",arr[i]);	
	}
	System.out.println();
	System.out.printf("평균 : %.2f\n",avg);// %.2f --float 소수 2째 자리까지 표현

	/*
	 * 배열 - 방 10개짜리 만들고 여기에 7의 배수를 쭉 채워서 출력하기
	 */
	int []arr2;
	
	arr = new int[10];
	
	for(i=0; i<10; i++)
	{
		System.out.printf("7배수 배열 : %d\n  ",i*7);
	
	}
    
	
}
}
