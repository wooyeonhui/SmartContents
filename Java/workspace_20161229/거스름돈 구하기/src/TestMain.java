import java.util.Scanner;

public class TestMain {
 public static void main(String[] args) {
	/*
	 * 1. 입력 : 거슬러줘야 할 금액 
	 * 2. 결과 : 
	 *           50000, 10000, 5000, 1000, 500 ,100, 50, 10원의 갯수
	 *
	 */
	 //1. 변수 선언
	 int inputMoney;
	 int m50000, m10000, m5000, m1000, m500, m100, m50, m10;
	 //2. 입력받기
	 Scanner sc = new Scanner(System.in);
	 System.out.print("거스름돈 : ");
	 inputMoney = sc.nextInt();
	 
	 m50000 = inputMoney/50000;
	 inputMoney = inputMoney%50000;
	 //나머지 가지고 계산
	 
	 m10000 = inputMoney/10000;
	 inputMoney = inputMoney%10000;
	 
	 m5000 = inputMoney/5000;
	 inputMoney = inputMoney%5000;
	 
	 m1000 = inputMoney/1000;
	 inputMoney = inputMoney%1000;
	 
	 m500 = inputMoney/500;
	 inputMoney = inputMoney%500;
	 
	 m100 = inputMoney/100;
	 inputMoney = inputMoney%100;
	 
	 m50 = inputMoney/50;
	 inputMoney = inputMoney%50;
	 
	 System.out.println("오만원 " + m50000 + " 장");
	 System.out.println("만원 " + m10000 + "장");
	 System.out.println("오천원 " + m5000 + "장");
	 System.out.println("천원 " + m1000 + "장");
	 System.out.println("오백원 " + m500 + "장");
	 System.out.println("백원 " + m100 + "장");
	 System.out.println("오십원 " + m50 + "장");
	 
	 
 }
}
