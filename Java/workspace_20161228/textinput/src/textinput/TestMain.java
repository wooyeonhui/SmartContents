package textinput;

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
		
		// \t - ��Ű, \n -�ٹٲ� ��ȣ
		System.out.println(name + "\t");
		System.out.println(phone + "\t");
		System.out.println(address + "\t");
		
		
	}

}