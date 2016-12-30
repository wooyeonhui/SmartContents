import java.util.Scanner;

public class TestMain {
	public static void main(String[] atgs){
		String name;
		String phone;
		String address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.nextLine();
	    System.out.println("전화번호 : ");
		phone = sc.nextLine();
		System.out.println("주소 : ");
		address = sc.nextLine();
		// 역슬래쉬 + 문자 - 이스케이프키
		// \t - 탭키, \n -줄바꿈 기호
		System.out.print(name + "\t\t\t");
		System.out.print(phone + "\t\t\t");
		System.out.print(address + "\n\n\n");
		
		
	}
}
