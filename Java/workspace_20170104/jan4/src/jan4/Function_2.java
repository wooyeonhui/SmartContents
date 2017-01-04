package jan4;

public class Function_2 {
	
	static void displayStar(int lineCnt, int starCnt)
	{
		int i,j;
		for(i=1; i<=lineCnt; i++)
		{
			for(j=1; j<=starCnt; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		displayStar(3,5);
		displayStar(5,7);
		displayStar(3,30);
	}

}
