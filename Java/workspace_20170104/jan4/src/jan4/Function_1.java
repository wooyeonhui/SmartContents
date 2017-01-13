package jan4;
/*
 * static : ��Ģ������ Ŭ�������� ��� �Լ��� ������ 
 * ��ü�� �������� ������ ���Ұ��ϳ� 
 * ���������� static�� ���̸�, ��ü�� �ȸ��� 
 * ����� �����ϴ�
 * static �� ���� �ֵ��� ���� �� ������ ȣ�Ⱑ��.
 */
public class Function_1 {

	
	static //�Լ�����
	void displayStar()
	{
		System.out.println("**************************************");
	}
	
	static void displayStar(int starCnt)
	{
		/*
		 * int starCnt : �Ķ����, �μ�, �Ű�������� ���� �θ��� ���⿡ �����
		 * ������ ���� �Լ� �ܺο��� ���� ������ �� �ִ�
		 * �Լ� ȣ�� ����� displayStar(10); �̷������� ȣ���Ѵ�.
		 */
		for(int i=1; i<starCnt; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		//�Լ� ȣ���ϱ�
//		displayStar();
//		displayStar();
//		displayStar();
//		displayStar();
//		displayStar();
//		displayStar();
		for(int i=1; i<=5; i++)
		{
			displayStar();
		}
		displayStar(10);
		displayStar(50);
		displayStar(5);
		
		for(int i=1; i<=10; i++)
		{
			displayStar(i);
		}
	}

}