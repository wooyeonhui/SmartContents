package jan3;

public class Array_2D {
public static void main(String[] args) {
	int [][]arr; //배열의 배열
	//wrang
	arr = new int[5][4];//5x4가 만들어 진다.
	
	int i,j,k;
	
	k=1;
	for(i=0; i<5; i++)
	{
		for(j=0; j<4; j++)
		{
			arr[i][j] = k++;
		}
	}

	int s1=0; // 세로 합
	int s_1=0; //가로 합& 모서리
	for(i=0; i<5; i++)
	{
		for(j=0; j<4; j++)
		{
			System.out.printf("%4d",arr[i][j]);
			//가로합
			s_1 +=arr[0][j]; 
			
		}
		System.out.printf("%4d",s_1);
		System.out.println();
	}
//세로합
	for(i=0; i<5; i++)
	{
		
		s1+=arr[i][0];
	}
   System.out.printf("%4d",s1);
	
}
}
