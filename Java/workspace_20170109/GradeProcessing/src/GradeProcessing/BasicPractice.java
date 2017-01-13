package GradeProcessing;

import java.util.Scanner;

public class BasicPractice {
  final int MAX=3;
  String []name=new String[MAX];
  String []idnum=new String[MAX];
  int []write = new int[MAX];
  int []word = new int[MAX];
  int []ppt = new int[MAX];
  int []spread = new int[MAX];
  int []total = new int[MAX];
  String []grade = new String[MAX];
  int count = 0;
  Scanner sc= new Scanner(System.in);
  
  void input()
  {
	  for(int i=0; i<MAX; i++)
	  {
		  System.out.println("�����ȣ : ");
		  idnum[i] = sc.nextLine();
		  System.out.println("�̸� : ");
		  name[i] = sc.nextLine();
		  System.out.println("�ʱ� : ");
		  write[i] = sc.nextInt();
		  System.out.println("���� : ");
		  word[i] = sc.nextInt();
		  System.out.println("���������̼� : ");
		  ppt[i] =sc.nextInt();
		  System.out.println("�������彬Ʈ : ");
		  spread[i] = sc.nextInt();
		  sc.nextLine();//���� ������
		  
		  
	  }
  }
  
  void process()
  {
	  for(int i=0; i<MAX; i++)
	  {
		total[i] = write[i] += word[i] += ppt[i] += spread[i];
        switch( total[i]/200)
        {
        case 5:
        case 4:
        	grade[i] = "A���";
        	break;
        case 3:
        	grade[i] = "B���";
        	break;
        case 2:
        	grade[i] = "C���";
        	break;
        case 1 : 
        	grade[i] = "D���, ����� ���";
        	break;     	
        } 
	  }
  }
  void output()
  {
	  for(int i=0; i<MAX; i++)
	  {
	  System.out.println(idnum[i] + "\t");
	  System.out.println(name[i] + "\t");
	  System.out.println(write[i] + "\t");
	  System.out.println(word[i] + "\t");
	  System.out.println(ppt[i] + "\t");
	  System.out.println(spread[i] + "\t");
	  System.out.println(total[i] + "\t");
	  System.out.println(grade[i] + "\n");
	  }
  }
  public static void main(String[] args) {
	BasicPractice bp = new BasicPractice();
	bp.input();
	bp.process();
	bp.output();
	
	
}
}
 