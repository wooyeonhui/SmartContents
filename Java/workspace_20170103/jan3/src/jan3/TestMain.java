package jan3;

public class TestMain {
public static void main(String[] args) {
	 //1. ���� ����
	final int MAX=5;
	
	int [][]a = new int[MAX][MAX];
	int i, j, k;
	
	k=1;
	for(i=0; i<MAX-1; i++)
	{
		for(j=0; j<MAX-1; j++)
		{
			a[i][j]=k++;
		}
	}
	//���� ���ϱ�
	//a[4][0] = a[0][0] +  a[1][0] + a[2][0] + a[3][0];
	//a[4][0] +=a[i][0];
	for(j=0; j<MAX-1; j++ )
	{
		for(i=0; i<MAX-1; i++)
		{
			a[i][4]+=a[i][j];
		}
	}
	
	//���� ���ϱ�
	for(i=0; i<MAX-1; i++ )
	{
		for(j=0; j<MAX-1; j++)
		{
			a[i][4]+=a[i][j];
		}
	}
	//4. ���
	for(i=0; i<MAX; i++)
	{
		for(j=0; j<MAX; j++)
		{
			System.out.printf("%4d",a[i][j]);
		}
		System.out.println();
	}
}
}