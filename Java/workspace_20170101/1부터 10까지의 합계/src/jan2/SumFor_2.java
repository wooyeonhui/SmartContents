package jan2;

import java.util.Scanner;

public class SumFor_2 {

	public static void main(String[] args) {
		/*
		 * ���� 10���� �Է¹޾Ƽ� ¦���� Ȧ���� ����� ���ϱ� 
		 * ¦���� 10���� ���� �� �� �ְ� Ȧ���� 10�� ���� �� ���ִ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int getNumber=0;//�Է� �޴� ����
		int EvenSum=0;//¦�� ��
		int EvenN=0;//¦�� ����
		int EvenAvg;
        int OddSum=0;//Ȧ�� ��
        int OddN=0;//Ȧ�� ����
        int OddAvg;
        int i;
        
        for(i=1; i<=10; i++)
        {
        	System.out.println(i+"��° ���� �Է� : ");
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
        
        System.out.printf("¦���� ��� %-2d",EvenAvg);
        System.out.printf("Ȧ���� ��� %-2d",OddAvg);

	}

}
