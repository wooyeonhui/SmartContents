
public class EscapeTest {
   public static void main(String[] args) {
        System.out.println("\"Hello\"");
        
        System.out.println("역슬래쉬 출력하기 : \\");
        
        System.out.println("100%");
        /*자바 1.5부터 추가된 출력함수가 있음
         * printf 함수 사용하기
         * 
         * %d - decimal (10진수)
         * %s - string (String)
         * %f - 실수
         * %1f - double
         * %x - 16진수 형태로 출력
         * %o - 8진수 형태로 출력
         */
        
        System.out.printf("%d %s\n",23,"문자열");
        System.out.printf("%d %x %o\n",16,16,16);
        System.out.printf("%d %x %o\n",15,15,15);
        
        //자릿수 배정이 가능하다
        System.out.print(10);
        System.out.print(20);
        System.out.println();//줄바꿈
        
        System.out.println("%d %d\n",10,20);
        System.out.println("%10d %10d\n",10,20);//왼쪽에서 10칸 띄우기
        System.out.println("%-10d %-10d\n",10,20);//오른쪽에서 10칸띄우기
    }
}
