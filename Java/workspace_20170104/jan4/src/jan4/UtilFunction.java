package jan4;

public class UtilFunction {
 //1~N ������ �հ踦 ���ϴ� �Լ�
	void Sigma(int n)//��ȯ�� ���� ���
	{
		int i, s;
		//�Լ��ȿ� ����Ǵ� ������ �Լ��ȿ��� ���� - ��������
		s=0;
		for(i=1; i<=n; i++)
		{
			s+=i;
		}
		System.out.println("�հ� : " + s);
	}
// ----------------------------------------
	int Sigma2(int n)
	{
		int i, s;
		
		s=0;
		for(i=1; i<=n; i++)
		{
			s+=i;
		}
		return s;
	}
	public static void main(String[] args)
	{
		//��ü�����
		UtilFunction tm = new UtilFunction();
		tm.Sigma(100);//��ü�� �̿��� �Լ��� ȣ���Ѵ�.
		
		int result = tm.Sigma2(1000);
		System.out.println(result);
		
		System.out.println(tm.Sigma2(10000));
		//�Լ��� void�� ��ȯ�ϰ�쿡�� �̷��� ���� �Ұ�.
	}
}