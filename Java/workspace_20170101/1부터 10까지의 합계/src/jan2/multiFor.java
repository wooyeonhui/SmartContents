package jan2;

public class multiFor {
public static void main(String[] args) {
	int i, j;
	for(i=1; i<=5; i++)
	{
		for(j=1; j<=5; j++)
		{
			System.out.printf("i=%d j=%d\n",i,j);
		}
	}
	
	//구구단
	for(i=1; i<=9; i++)
	{
		System.out.printf("==%d 단==\n",i);
		for(j=1; j<=9; j++)
		{
			System.out.printf("%d X %d = %d\n",i,j,i*j);
		}
		System.out.println();
	}
	
	for(i=1; i<=5; i++)
	{
		for(j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=1; i<=5; i++)
	{
		for(j=5; i<=j; j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
//for 쓰고
	for(i=1; i<=25; i++)
	{
		System.out.printf("%4d",i);
		if( i%5==0)
		{
			System.out.println();			
		}
	}
//for 안쓰고
	int k=1;
	for(i=1; i<=5; i++)
	{
		for(j=0; j<=5;j++)
		{
			System.out.print(k+" ");			
		}
		System.out.println();
	}
	//알파벳
	int b=64;
	for(i=1; i<=5; i++)
	{
		
		for(j=1; j<=i; j++)
		{   
			System.out.print((char)(b+j));
			b++;
		}
		System.out.println();
	}
	//알파벳 뺵
	k='A';
	for(i=1; i<=5; i++)
	{
		for(j=1; j<=i; j++)
		{
			System.out.print(((char)k));
			k++;
		}
		System.out.println();
	}
	//알파벳 써클
	k='A';
	for( i=0; i<=25; i++)
	{
		k='A'+i;
		
		for( j=0; j<=25;j++)
		{
			System.out.print((char)k+" ");
			k++;
			if(k == 'Z'+1)
			{
				k='A';
			}
		}
		
		System.out.println();
	}
	//별트리
	String d = (" ");
	int g=0;
	int h=0;
	for(i=1; i<=4; i++)		
	{	
		for(g=3 ;i<=g; g--){				
		System.out.print(d);			
		}
		for(j=2; j<=i; j++)
				
			System.out.print("*");
	    for(h=2;h<=j;h++)
			System.out.print("*");
			
		
		
		
		System.out.println();
	}
}
}
