package jan2;

import java.util.Scanner;

public class SumFor_1 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int count=0;
       int a;
       int start=1;
       int end=10;
       int inc=1;
       int i=0;
       
       for(i=start; i<=end; i+=inc){
       System.out.println(i+ "������ �Է��ϼ��� : ");
       a = sc.nextInt();
         if( a%2 == 0 )
         {
        	 System.out.println("¦�����Դ�! : "+a);
             System.out.printf("¦���� ����:%-2d\n",count=count+1);
         }
         
       }
	}

}
