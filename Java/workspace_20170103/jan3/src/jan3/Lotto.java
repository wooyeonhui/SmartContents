package jan3;

import java.util.Random;

public class Lotto {
public static void main(String[] args) {
	//��� - ����ó�� �������� ����ȯ ���ϰ�
	final int MAX=6;
	int []lotto;
	int i;
	boolean duplicate;//�ߺ��̳�?
	int count;
	Random rand = new Random();
	
	lotto = new int[MAX];
	count=0;
	while(count<MAX)//������ ������ �� ���� ������
	{
		int temp =rand.nextInt(45)+1;
		/*
		 * �ӽð� �ϳ� ����, �� ���� �̹� lotto
		 * �迭�� �����ϴ��� Ȯ���Ѵ�.
		 */
		duplicate = false;
		for(i=0; i<count; i++)
		{
			if( lotto[i] ==temp)
			{//������
			duplicate = true;
			break;
			}
		}//�����ϸ� ��� ���ϸ� ��� �ݺ��ؾ���
		if( duplicate == false)
		{
	       lotto[count] = temp;
	       count++;
		}
	}
	System.out.print("Lotto Number : ");
	for(i=0; i<MAX; i++)
	{
		System.out.printf("%4d", lotto[i]);
	}
	System.out.println();
}
}