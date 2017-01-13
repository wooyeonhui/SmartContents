package WeekPayProcessing;

public class PayData {
   private String name;
   private int workTime;
   private int hourWage;//�ð��� �޿��� 
   private int overWage;//�ʰ����� calc
   private double tax;
   private int initialPay;//�⺻�ݾ� calc
   private int totalPay;//�⺻�ݾ�+�ʰ����� calc
   private int pay;//totalpay- ����calc
   
   public void calc()//�⺻�ݾ�
   {
	   initialPay = workTime*hourWage;
	   
	   if (workTime>40)
	   {
		   overWage = (workTime-40)*10000/2;//�ʰ� ����
	   }
	   
	   totalPay = initialPay + overWage;
	   
	   if (totalPay >400000)
	   {
		   tax =0.044;
	   }else if(totalPay >300000)
	   {
		   tax =0.033;
	   }else
	   {
		   tax =0.022; 
	   }
	   
	   pay =(int)( totalPay-(totalPay*tax));
   }
   
  
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getWorkTime() {
	return workTime;
}
public void setWorkTime(int workTime) {
	this.workTime = workTime;
}
public int getHourWage() {
	return hourWage;
}
public void setHourWage(int hourWage) {
	this.hourWage = hourWage;
}
public int getOverWage() {
	return overWage;
}
public void setOverWage(int overWage) {
	this.overWage = overWage;
}
public double getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
public int getInitialPay() {
	return initialPay;
}
public void setInitialPay(int initialPay) {
	this.initialPay = initialPay;
}
public int getTotalPay() {
	return totalPay;
}
public void setTotalPay(int totalPay) {
	this.totalPay = totalPay;
}
public int getPay() {
	return pay;
}
public void setPay(int pay) {
	this.pay = pay;
}
   
   
}