package jan3;

import java.util.Random;

public class Landom {
   public static void main(String[] args) {
	Random random = new Random();
	
	System.out.println(random.nextInt());
	
	for(int i=1; i<=6; i++)
	System.out.println(random.nextInt(10)+1);
	
	//1~10�� ������ ���� 6�� ���ڸ� ���
	int []lotto = new int[6];
	for( int i=0; i<6; i++ )
	{
		lotto[i] = random.nextInt(10)+1;
	}
	
	for(int i=0; i<6; i++)
	{
		System.out.printf("%4d", lotto[i]);
	}
	System.out.println();
	
	
}
}