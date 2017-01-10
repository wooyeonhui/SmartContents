package WeekPayProcessing;

import java.util.Scanner;

public class PayManager {
	final int MAX=1;
	PayData []data = new PayData[MAX];
	
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		for(int i=0; i<MAX; i++)
		{
			data[i] = new PayData();
			
			System.out.println("�̸� �Է� : ");
			data[i].setName(sc.nextLine());
			System.out.println("�ñ� �Է� : ");
			data[i].setHourWage(sc.nextInt());
			System.out.println("���� �ð� �Է� : ");
			data[i].setWorkTime(sc.nextInt());
			data[i].calc();
			sc.nextLine();
		}
	}
	
	void output()
	{
		for(int i=0; i<MAX; i++)
		{
			System.out.print(data[i].getName()+"\t");
			System.out.print("���� �ð� : "+data[i].getWorkTime()+"\t");
			System.out.print("�ñ� : "+data[i].getHourWage()+"\t");
			System.out.print("�ʰ����� : "+data[i].getOverWage()+"\t");
			System.out.print("�⺻�ݾ� : "+data[i].getInitialPay()+"\t");
			System.out.print("����% : "+data[i].getTax()+"% \t");
			System.out.print("���� �ݾ� : "+data[i].getTotalPay()+"\t");
			System.out.print("���� �ݾ� : "+data[i].getPay()+"\n");
		}
	}

}
