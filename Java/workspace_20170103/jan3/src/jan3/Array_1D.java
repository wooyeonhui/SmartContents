package jan3;

public class Array_1D {

	public static void main(String[] args) {
		int []arr;
		arr = new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int i=0;i<5; i++)
			arr[i]=(i+1)*10;
		
		for(int i=0; i<5; i++)
			System.out.println(arr[i]);
	
	/*
	 * ���� 10�� �о ��� ���ؼ� �Էµ� ���� �ٽ� �� ����ϰ�
	 * ��յ� ����ϱ�
	 */
	int b=0;
		
	arr = new int[10];
	
	for(int i=0; i<10; i++)
		arr[i]=(i+1)*10;
    for(int i=0;i<10; i++)
    	
    		b +=arr[i];
    	System.out.println("���� : "+b);
   for(int i=0;i<10; i++)
		System.out.println("��� : "+b/i);
	}

}