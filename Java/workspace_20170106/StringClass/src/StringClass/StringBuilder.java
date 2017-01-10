package StringClass;

public class StringBuilder {
	public static void mian(String[] args) {
		
    	StringBuilder sb = new StringBuilder();
    	String s = new String();
    	int i;
    	s="flower";
    	
    	
        sb.append("flower");
        sb.setCharAt(0,'F');
        sb.insert(2,'K');
        sb.delete(3,4);
        
        System.out.println(s);
        System.out.println(sb);
        
        
//    	System.out.println("시작");
//    	for(i=1; i<=100; i++)
//    	{
//    		s = s + i;
//    	}
//    	System.out.println(s);
//    	
//    	System.out.println("시작");
//    	for(i=1; i<=100; i++)
//    	{
//    		sb.append(i);
//    	}
//    	System.out.println(sb);
//	}



}
