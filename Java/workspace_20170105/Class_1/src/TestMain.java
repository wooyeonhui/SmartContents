import kr.co.himedia.Person;

//����Ʈ ��Ű�� - ��Ű���� ���� ����
public class TestMain {
/*
 * Acompany ��Ű�� ����� �ű⿡ System Ŭ������ ������
 * Acompany.System
 * Bcompany ��Ű�� ����� �ű⿡ System Ŭ������ ������
 * Bcompany.System
 * 
 * ��Ű�� �̸��� ���? ȸ�� Ȩ������ ������
 * �������� ����� ����� ������ ������ ������� �� 
 * �Ʒ��� ���� ��Ű���� ���� Ŭ������ �д�
 * himedia.co.kr
 * 
 * kr.co.himedia
 */
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setName("ȫ�浿");
		p1.setAge(15); 
		
		System.out.print(p1.getName());
		System.out.println(p1.getAge());
	}
}