package switch_ex;

import java.util.Scanner;

/*
 * ����, ������ ���� ����ϱ�
 */
public class TestMain {
	public static void main(String[] args) {
		String season;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		season = sc.nextLine();
		
		switch(season)
		{
		case "��":
		  System.out.println("����,���ٸ�,�޲ٹ�");
		   break;
		case "����":
		  System.out.println("�ø�,��¡��,������");
		   break;		   
		case "����":
		  System.out.println("��,����,�����");
		   break;		   
		case "�ܿ�":
		  System.out.println("��,����,��");
		   break;
        default:
        	 System.out.println("�ɿ�~");
		     break;
		}
	}

}
