package inherit;

class Parent
{
	private int x;
	protected int y;
	public int z;
	
	/*
	 * �θ�Ŭ�������� �������� ������ �Լ��� ���� �ȵ�� �ٽ������� �� �ִ�.
	 * -overriding
	 * 
	 *   overloading : ���� Ŭ���������� �̸��� ���� ���°� �ٸ� �Լ���
	 *   
	 *   overriding : ��Ӱ��迡�� �θ� Ŭ������ �޼��带 �ٽ� �����Ѱ�
	 *   
	 *   ������̼� : ������ �ּ�, @�� �����Ѵ� 
	 *              �ڹٰ� �������Ҷ� Ư���� ���ø� �ϰ��� �� �� ����Ѵ�.
	 *              ���� ������̼��� �ڹ�Ŭ������ �̿��� ����� �� ����
	 *              �ִ�. �����ϸ� �ȵ�, ���δ� ��ü �ҽ��� ������ ��ġ��
	 *              ��쵵 ����.
	 *              �ڹ� 1.5���� ���ԵǾ���
	 *             @Override - �θ�Ŭ������ ���� �������� �Լ�(�޼���)�� 
	 *             ������ �� �� �ʿ��ϴ�. ��� �Ǵµ� �̰� �ٿ��� �ϴ� ������
	 *             �θ�Ŭ������ �޼���� �Ȱ��� �̸� �Ȱ��� Ÿ�� �Ű����� �� ���°�
	 *             �Ȱ��ƾ� overriding�ε�, �߸� ���� �����Ϸ��� �� �� ����.
	 *             �׷��� @Override�� �ٿ��ָ� �����ڰ� �������̵��� �߸� ������
	 *             �̸� �˷��ش�.
	 */
	
/*
 * �������̵��� �ڹ� 1.4���� ���������� ������ �ܰ迡��
 * ������ ������ �� �� ����. �׷��� 1.5���� 
 * �����ϴܰ迡�� ������ �˷��ֱ� ���� �������
 * @Override �̴�
 */
	@Override
	public String toString() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		//super - �ڱ� �θ�
		//this - ��
		//return super.toStirng();
		/*String.format �Լ��� ���� ���ڵ� �پ��� �����͸�
		 * ���ļ� String���� ������ش�.
		 * System.out.prinf �Լ��� ������ �����ϴ�
		 */
		return String.format("x=%d y=%d x=%d",x,y,z);
		
		//return super.toString();
	}
	public Parent()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	//�� ����(c++���α׷��� ���̺�), ���Ʈ ����Ʈ
	//���ʺ� - ������, �輱��(���L����)
	public Parent(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public boolean equals(Object obj) {
         System.out.println("******************");
         Parent temp = (Parent)obj;
         if( temp.x==this.x && temp.y==this.y&&temp.z==this.z)
         {
        	 return true;
         }
         else
         {
        	 return false;
         }
	}
}
public class TestMain {
  public static void main(String[] args) {
	 Parent p = new Parent();
	 String s="";
	 Object ob = new Object();
	 
	 //p.x = 10;
	 p.y = 20;
	 p.z = 30;
	 
	 System.out.println(p);
	 System.out.println(p.toString());
	 
	 //��ĳ���� - �ڽ����� �θ������� ��ȯ�Ǵ� ����ȯ
	 ob = p; //parent Ÿ���� Object Ÿ������ ��ȯ��
	       //�Ʒ����� ���� �ö󰡴� ����ȯ ������ ���
	 
	 //�ٿ�ĳ���� - �θ����� �ڽ������� ��ȯ�Ǵ� ����ȯ
	 p = (Parent)ob; //�̰� ��Ģ�� ������Ȳ 
     
	 //��ü�� ���� ������ �񱳸� �Ϸ��� �Ѵ�
	 
	 Parent p1 = new Parent(1,2,3);
	 Parent p2 = new Parent(1,2,3);
	 //
	 if(p1 == p2)
	 {
		 System.out.println("����");
	 }
	 else
	 {
		 System.out.println("�ٸ���");
	 }
	 
	 if(p1.equals(p2))
	 {
		 System.out.println("����");
	 }
	 else
	 {
		 System.out.println("�ٸ���");
	 }
  }
}