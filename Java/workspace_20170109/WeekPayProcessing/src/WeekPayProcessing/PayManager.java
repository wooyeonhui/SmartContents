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
			
			System.out.println("이름 입력 : ");
			data[i].setName(sc.nextLine());
			System.out.println("시급 입력 : ");
			data[i].setHourWage(sc.nextInt());
			System.out.println("일한 시간 입력 : ");
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
			System.out.print("일한 시간 : "+data[i].getWorkTime()+"\t");
			System.out.print("시급 : "+data[i].getHourWage()+"\t");
			System.out.print("초과수당 : "+data[i].getOverWage()+"\t");
			System.out.print("기본금액 : "+data[i].getInitialPay()+"\t");
			System.out.print("세금% : "+data[i].getTax()+"% \t");
			System.out.print("세전 금액 : "+data[i].getTotalPay()+"\t");
			System.out.print("세후 금액 : "+data[i].getPay()+"\n");
		}
	}

}
