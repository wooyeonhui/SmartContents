package bascketball;

import java.util.Random;
import java.util.Scanner;
 
public class GameSet {
	
    Scanner sc = new Scanner(System.in);
    
	private final int MAX = 3; //������ �̱� 
	private int[] setRan = new int[MAX];
	private int []User = new int[MAX];
	
	//���� �� �̱�0~9
    public void start()
	{
		Random rand = new Random();
		for(int i = 0; i < MAX; i++)
		{	setRan[i] = rand.nextInt(10);

		}
	}	
	
  //����� ���� �Է��ϱ�
    public void UserSet(){
	  User = new int[3]; //����� �Է� ����
	  for(int i=0; i<3; i++)
	  {
		  System.out.println(i+"��° ���� �Է� : ");
		  User[i] = sc.nextInt();
		  }
	  }
    
    //��ġ Ȯ�� 
    int countout =0;
    int countstrike =0;
    int countball=0;
   public boolean isExist(int key)
    {
    	for(int i=0; i<MAX; i++)
    	{
    		if( setRan[i] == User[i])//������ ���ڰ� ������
    		{
    			System.out.println("��Ʈ�����!");
    			countstrike++;
    		}else if( setRan == User )//���ڸ� ������ (?!)
    		{
    			System.out.println("��");
    			countball++;
    		}
    		System.out.println(countstrike+"��Ʈ����ũ  ,"+countball+"��  ,"+countout+"�ƿ�");
    		 if(countstrike == 3)//
        	 {
        		return true;
        	 }	    
    	}
    	
		return false;
    }

  

}