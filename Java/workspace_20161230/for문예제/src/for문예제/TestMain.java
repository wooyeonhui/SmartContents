package for������;

public class TestMain {
    public static void main(String[] args) {
		int i;
		
		System.out.println("1~10���� ���");
		for(i=1; i<=10; i++){
			System.out.println(i);
		}
		System.out.println("1~10���� ¦���� ���");
		for(i=2; i<=10; i+=2){
			System.out.println(i);
		}
		System.out.println("1~10���� Ȧ���� ���");
		for(i=1; i<=10; i=i+2){
			System.out.println(i);
		}
		System.out.println("A~Z���� ��� ");
		for(i=0; i<26; i++){
			System.out.println((char)('A'+i));
		}
		System.out.println("A~Z���� ��� ");
		for(i='A'; i<='Z'; i++){
			System.out.println((char)i);
		}
		System.out.println("����� �����غ���");
		for(i=1; i<=100; i++)
		{
			System.out.printf("%4d",i);
			if( i%10==0 )
			{
				System.out.println();
			}
		}
		System.out.println("100~10���� -10�� �ؼ� ����ϱ�");
		for(i=100; i>0; i-=10)
		{
			System.out.printf("%4d",i);
		}
		System.out.println();
	}
}
