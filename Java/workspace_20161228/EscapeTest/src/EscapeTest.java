
public class EscapeTest {
   public static void main(String[] args) {
        System.out.println("\"Hello\"");
        
        System.out.println("�������� ����ϱ� : \\");
        
        System.out.println("100%");
        /*�ڹ� 1.5���� �߰��� ����Լ��� ����
         * printf �Լ� ����ϱ�
         * 
         * %d - decimal (10����)
         * %s - string (String)
         * %f - �Ǽ�
         * %1f - double
         * %x - 16���� ���·� ���
         * %o - 8���� ���·� ���
         */
        
        System.out.printf("%d %s\n",23,"���ڿ�");
        System.out.printf("%d %x %o\n",16,16,16);
        System.out.printf("%d %x %o\n",15,15,15);
        
        //�ڸ��� ������ �����ϴ�
        System.out.print(10);
        System.out.print(20);
        System.out.println();//�ٹٲ�
        
        System.out.println("%d %d\n",10,20);
        System.out.println("%10d %10d\n",10,20);//���ʿ��� 10ĭ ����
        System.out.println("%-10d %-10d\n",10,20);//�����ʿ��� 10ĭ����
    }
}
