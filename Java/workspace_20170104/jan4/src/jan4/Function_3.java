package jan4;

public class Function_3 {
  //��ȯ���� �ִ� �Լ� - �۾� �� �ܺη� ���� �����ؾ� �Ҷ�
  //�� ��� - ��ȯ���� �� �Ѱ��� �����ϴ�, ���� ����
	static int add(int x, int y)//��ü�� ������ �ʰ� ����Ҷ� static�� ���ش�
	{
		//�ΰ��� ������ �Է¹޾� ���ؼ� ����� ��ȯ�� �Լ�
		//�Լ��տ� void �̿��� Ÿ���� ���� �ݵ�� return ������ �ۼ��ؾ� �Ѵ�.
		int z = x+y;
		return z;
	}
	public static void main(String[] args) {
	int result;
	
	result = add(10,20);
	System.out.println(result);
    }
}