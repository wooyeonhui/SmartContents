package jan3;

public class Array_2D {
public static void main(String[] args) {
	int [][]arr; //�迭�� �迭
	//wrang
	arr = new int[5][4];//5x4�� ����� ����.
	
	int i,j,k;
	
	k=1;
	for(i=0; i<5; i++)
	{
		for(j=0; j<4; j++)
		{
			arr[i][j] = k++;
		}
	}

	int s1=0; // ���� ��
	int s_1=0; //���� ��& �𼭸�
	for(i=0; i<5; i++)
	{
		for(j=0; j<4; j++)
		{
			System.out.printf("%4d",arr[i][j]);
			//������
			s_1 +=arr[0][j]; 
			
		}
		System.out.printf("%4d",s_1);
		System.out.println();
	}
//������
	for(i=0; i<5; i++)
	{
		
		s1+=arr[i][0];
	}
   System.out.printf("%4d",s1);
	
}
}