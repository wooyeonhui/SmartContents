package GradeProcessing;

import java.util.Scanner;

public class TestMain {

	

public static void main(String[] args) {
	
	GradeProcessing gp1 = new GradeProcessing();
	GradeProcessing gp2 = new GradeProcessing();
	GradeProcessing gp3 = new GradeProcessing();
//	
//	for(int i=0; i<3; i++)
//	{
		System.out.println("�̸� : ");
	    gp1.name = sc.nextLine();
		System.out.println("�����ȣ : ");
		gp1.idnum = sc.nextLine();
		System.out.println("�ʱ� : ");
		gp1.write = sc.nextInt();
		System.out.println("���� : ");
		gp1.word = sc.nextInt();
		System.out.println("���������̼� : ");
		gp1.ppt =sc.nextInt();
		System.out.println("�������彬Ʈ : ");
		gp1.spread = sc.nextInt();
		gp1.total = gp1.write + gp1.word + gp1.ppt + gp1.spread;
		System.out.println("���� : "+gp1.total);
		
		
//	}
	
}  

	static Scanner sc =new Scanner(System.in);
	
	
}
