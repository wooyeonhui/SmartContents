package jan3;

public class TestMain_2 {
	public static void main(String[] args) {
		//1. ���� ����
	 final int MAX=10;
	 
	 int [][]a= new int[MAX][MAX];
	 int i, j, k;
	 
	 k=1;
	 //10x10
	 for(i=0; i<MAX-1; i++)
	 {
		 for(j=0; j<MAX-1; j++)
		 {
			 a[i][j]=k++;
		 }
	 }
	 //Ʈ����
	 k=1;
	 for(i=0; i<MAX-1; i++)
	 {
		 for(j=0; j<i; j++)
		 {
			 a[i][j]=k++;
		 }
	 }
	 //���
	
	 for(i=0; i<MAX-1; i++)
	 {
		 for(j=0; j<i; j++)
		 {			
			 System.out.printf("%-4d",a[i][j]);
		 }
		 System.out.println();
	 }
	 
	 
	}

}