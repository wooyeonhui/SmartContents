package StringClass;

import java.util.Scanner;

public class TestMain {
 public static void main(String[] args) {
	 String s1 = "String";//�������� ��Ȳ�̴�
	 String s2 = new String("String");
	 String s3 = new String();
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 
	 System.out.println(s1.charAt(0));
	 System.out.println(s1.charAt(1));
	 System.out.println(s1.charAt(2));
	 System.out.println(s1.charAt(3));
	 System.out.println(s1.charAt(4));
	 System.out.println(s1.charAt(5));
//	 System.out.println(s1.charAt(6));
	 
	 //���ڿ��� ���� �˾Ƴ���
	 System.out.println(s1.length());
	 
	 s3="124";
	 int a = Integer.parseInt(s3);//String --> int�� ��
	 
	 System.out.println(s3);

	 s3 = String.valueOf(a);//int --> String���� ��ȯ
	 System.out.println(s3.toString());
	 System.out.println(Integer.toString(123));
	 
	 char []buffer={'b','i','g'};
	 s3 = new String(buffer);
	 
	 s1="java";
	 s2="��ü����";
	 
	 s3 = s1.concat(s2); //s3 = s1 + s2;
	 
	 System.out.println(s3);
	 
	 //���ڿ��� �����ϱ�
	 s1 = "2017-01-06";
	 
	 String year = s1.substring(0, 4); //0~3���� �����ϱ�
	 System.out.println("���� : "+ year);
	 
	 String month = s1.substring(5,7); //5,6�����ϱ�
	 
	 String day = s1.substring(8,10); //5,6�����ϱ�
			 
	 System.out.println(month);
	 System.out.println(day);
	 
	 s1="Ű��,�ڸ�,����,���,������,��,������,�޵�,�ڵ�";
	 
	 String []fruits = s1.split(",");
	 //,�� �������� ���ڿ��� �߶��
	 
	for(int i=0; i<fruits.length; i++)
	{
		System.out.println(fruits[i]);
	}
	 
	s1=" Ű ��  ";
	System.out.println("*"+s1+"*");
	System.out.println("*"+s1.trim()+"*");//�߰� ����� ��¿ �� ����
	
	s1="korea";
	System.out.println(s1.toUpperCase());
	
	s1="PRESIDENT";
	System.out.println(s1.toLowerCase());

	//���ڰ� �ִ°��� ��ġ�� ��ȯ�ϴ� �Լ� indexOf�Լ�
	int pos = s1.indexOf('R');
	System.out.println(pos);
	
	pos = s1.indexOf('A');
	System.out.println(pos);
	//���� ���ڸ� ã�� ��� -1�� ��ȯ�Ѵ�.
	
	pos = s1.lastIndexOf('A');
	System.out.println(pos);
	
	pos = s1.lastIndexOf('E');
	System.out.println(pos);
	
	//E�� �ִ� ���� �� ã�� ����ϰ� �ʹ�
	pos = s1.indexOf('E');
	while(pos!=-1)
	{
		System.out.println(pos);
		pos = s1.indexOf('E',pos+1); // �� ������ġ���� �̻��ϱ�
	}
	
	s1 = "���ڿ� ���� �Ķ���ͷ�";
	System.out.println(s1.contains("�Ķ�"));
	
	//���ڿ� �ٲٱ� ���
	s1 = s1.replace("�Ķ����", "�Ű�����");
	System.out.println(s1);
	
	s1="�쿬��";
	s2="�쿬��";
	
	s1 = new String("����");
	s2 = new String("�б�");
	
	if( s1.equals(s2))
	{
		System.out.println("����");
	}
	else
	{
		System.out.println("�ٸ���");
	}
	
	/*
	 * CompareTo - ��ȯ���� ����, 0, ��� ������
	 * �ΰ��� ���ڿ��� ���Ͽ� ���� ���ڿ��� ���������� �����̸�
	 * 1, ������ -1 ������ 0�� ��ȯ
	 */
	
	s1 = "����";
	s2 = "�б�";
	//if( s1.compareTo(s2)==0) s1.equals(s2)
	
	if( s1.compareTo(s2)<0)
		System.out.println("s1�� �۴�");
	else if(s1.compareTo(s2)>0)
		System.out.println("s1�� ũ��");
	else
		System.out.println("�Ѵ� ����");
} 
}