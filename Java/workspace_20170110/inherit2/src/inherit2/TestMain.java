package inherit2;


import java.util.ArrayList;
import java.util.List;

class Person
{
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return "name : " + name + "    age : " + age;
	}
}

public class TestMain {
	//unchecked ����� rawtypes ��� �ǳʶپ��
  @SuppressWarnings({ "unchecked", "rawtypes" })//������̼�
public static void main(String[] args) {
	  //�÷��� Ŭ���� - �÷���
	  List list = new ArrayList();
	  /*
	   * �߻�Ŭ���� - ������ Ŭ����, ��ü ���� ����
	   *          - �Լ� �߿� ������� �߻��Լ���
	   *            ���� �޼��� ����� ����, 
	   *            �����κ��� ����, ��� ����
	   *            extands �� ���
	   * �������̽� - �ƿ� ����� �� Ŭ����, ��ü ���� ����
	   *          - ����� �޼��� ����� �����Ѵ�
	   *           implements�� ����Ѵ�.
	   */
	  
	  list.add("���");
	  list.add("��ȭ");
	  list.add("ī��");
	  list.add("����");
	  list.add("�Ƹ�������");
	  
	  
	  for(int i=0; i<list.size(); i++)
	  {
		  System.out.println(list.get(i));
	  }
	  
	  List list2 = new ArrayList();
	  
	  //��ĳ����
	  list2.add(new Person("A",12));
	  list2.add(new Person("B",13));
	  list2.add(new Person("C",14));
	  list2.add(new Person("D",15));
	  list2.add(new Person("E",16));
	  
	  
	  for(int i=0; i<list2.size(); i++)
	  {
		  //������� �ٿ� ĳ����
		 Person temp = (Person)list2.get(i);
		 System.out.println(temp.toString());
	  }
	  
	  //������� �ֽŽ�
	  
	  List<Person> list3 = new ArrayList<Person>();
	  
	  list3.add(new Person("A",12));
	  list3.add(new Person("B",13));
	  list3.add(new Person("C",14));
	  list3.add(new Person("D",15));
	  list3.add(new Person("E",16));
	  
	  System.out.println();
	  for(int i=0; i<list3.size(); i++)
	  {
		  System.out.println(list3.get(i));
	  }
  }
}