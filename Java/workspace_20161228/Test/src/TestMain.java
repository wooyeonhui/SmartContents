import java.util.Scanner;

public class TestMain {
	public static void main(String[] atgs){
		String name;
		String phone;
		String address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
	    System.out.println("��ȭ��ȣ : ");
		phone = sc.nextLine();
		System.out.println("�ּ� : ");
		address = sc.nextLine();
		// �������� + ���� - �̽�������Ű
		// \t - ��Ű, \n -�ٹٲ� ��ȣ
		System.out.print(name + "\t\t\t");
		System.out.print(phone + "\t\t\t");
		System.out.print(address + "\n\n\n");
		
		
	}
}
