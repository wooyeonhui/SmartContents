package 사각형면적;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
       /*
        * 사각형 면적구하기
        * 1. 입력값 변수선언 : 가로, 세로
        * 2. 결과값 변수선언 : 면적
        * 3. 데이타 입력받기
        * 4. 계산하기
        * 5. 결과 출력하기
        */
  //1. 입력값 변수 선언하기
	int width; //가로
	int height;//세로
	//2. 결과값 변수 선언하기
	int surface;//면적
	//3. 입력받기
	Scanner sc = new Scanner(System.in);
	System.out.print("가로 : ");
	width = sc.nextInt();
    System.out.print("세로 : ");
    height = sc.nextInt();
    
    //4.계산하기
    surface = width * height;
    
    //5. 결과 출력하기
    System.out.println("면적은" + surface + "입니다.");
		
	}

}
