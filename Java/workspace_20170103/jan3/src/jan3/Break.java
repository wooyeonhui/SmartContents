package jan3;

public class Break {
  public static void main(String[] args) {
	  int i;
	  i=1;
	for(;;)
	{
		System.out.println(i);
		i++;
		if(i>10)
		{
			break;
		}
	}
	System.out.println("빠져 나옴 : "+i);
	
	//이중 for 문
	int j;
	
	boolean flag=false;
	
	for(i=1; i<=10; i++)
	{
		for(j=1; j<=10; j++)
		{
			if(j==5)
			{
				flag=true;
				break;
			}
			System.out.print("#");
		}
		if( flag==true )
			break;
		System.out.println("@");
	}
}
}
