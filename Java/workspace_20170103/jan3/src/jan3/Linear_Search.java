package jan3;

public class Linear_Search {
public static void main(String[] args) {
	int []arr = new int[]{10,20,30,40,50,55,66,77,88,99};
	//�迭�� �ʱⰪ �ֱ�
	int i;
	int key=77; //ã�� �� ���� �ִ� ����
	boolean find;
	
	find = false; //ó���� ��ã��
	for(i=0; i<10; i++)
	{
		if(arr[i]==key)
		{
			find=true;
			break;
		}
	}
	if( find ) // if(find==true)
	{
		System.out.println(i+1+"��° ��ġ");
	}
	else
	{
		System.out.println("ã�� �� �����ϴ�.");
	}
}
}