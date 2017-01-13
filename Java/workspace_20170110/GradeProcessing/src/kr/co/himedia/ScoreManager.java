package kr.co.himedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreManager {
  List<ScoreDto> dataList = new ArrayList<ScoreDto>();
  
  Scanner sc = new Scanner(System.in);
  
  public void start()
  {
	  int menu;
	  while(true)
	  {
		  menuDisplay();
		  System.out.print("���� : ");
		  menu = sc.nextInt();
		  switch(menu)
		  {
		  case 1 : output(); break;
		  case 2 : append(); break;
		  case 3 : modify(); break;
		  case 4 : delete(); break;
		  case 5 : search(); break;
		  case 0 : System.out.println("����"); 
		           return;//�Լ��� ������ �Ѵ�
		     default:
		    	  System.out.println("��!!");
		  }
	  }
  }
  
  public void menuDisplay()
  {
	  System.out.println("-------------");
	  System.out.println("    ��  ��     ");
	  System.out.println("-------------");
	  System.out.println("    1.���     ");
	  System.out.println("    2.�߰�     ");
	  System.out.println("    3.����     ");
	  System.out.println("    4.����     ");
	  System.out.println("    5.�˻�     ");
	  System.out.println("   [0]����     ");
	  System.out.println("-------------");
	  
	  

  }
  void output()
  {
	  for(int i=0; i<dataList.size(); i++)
	  {
		  ScoreDto temp=dataList.get(i);
		  System.out.println(temp.getName()+"\t");
		  System.out.println(temp.getKor()+"\t");
		  System.out.println(temp.getEng()+"\t");
		  System.out.println(temp.getMat()+"\t");
		  System.out.println(temp.getTotal()+"\t");
		  System.out.println(temp.getGrade()+"\t");
		  
	  }
  }
  
  void append()
  {
	  ScoreDto dto = new ScoreDto();
	  dataList.add(dto);
	  sc.nextLine(); //���ۿ� ���� ����Ű �о������
	  System.out.println("�̸� : ");
	  dto.setName(sc.nextLine());
	  System.out.println("���� : ");
	  dto.setKor(sc.nextInt());
	  System.out.println("���� : ");
	  dto.setEng(sc.nextInt());
	  System.out.println("���� : ");
	  dto.setMat(sc.nextInt());	  
	  dto.process();
	  
  }
  
  //�̸����� �˻��Ͽ� �� ��ġ�� ��ȯ�ϴ� �Լ� �����
  //�˻�, ����, ���� �������� ��� ����� �Լ�
  int find(String name)
  {
	  for(int i=0; i<dataList.size(); i++)
	  {
		  if(dataList.get(i).getName().equals(name))
		  {
			  return i;
		  }
	  }
	  return -1; //��ã�� ��� -1 ��ȯ
  }
  
  void search()
  {
	  String name;
	  System.out.print("ã�� �̸���? ");
	  sc.nextLine();
	  name = sc.nextLine();
	  int pos = find(name);
	  if(pos==1)
	  {
		  System.out.println(name + "is not found");
	  }
	  else
	  {
		  ScoreDto temp=dataList.get(pos);
		  System.out.println(temp.getName()+"\t");
		  System.out.println(temp.getKor()+"\t");
		  System.out.println(temp.getEng()+"\t");
		  System.out.println(temp.getMat()+"\t");
		  System.out.println(temp.getTotal()+"\t");
		  System.out.println(temp.getGrade()+"\t");
		  
	  }
  }
  void modify()
  {
	  String name;
	  System.out.print("������ �̸���? ");
	  sc.nextLine();
	  name = sc.nextLine();
	  int pos = find(name);
	  if(pos==-1)
	  {
		  System.out.println(name + "is not found");
	  }
	  else
	  {
		  ScoreDto dto = dataList.get(pos);
		  //�ٽ� �Է¹ޱ�
//		  ScoreDto dto = new ScoreDto();
//		  dataList.add(dto);
		  
		  System.out.println("�̸� : ");
		  dto.setName(sc.nextLine());
		  System.out.println("���� : ");
		  dto.setKor(sc.nextInt());
		  System.out.println("���� : ");
		  dto.setEng(sc.nextInt());
		  System.out.println("���� : ");
		  dto.setMat(sc.nextInt());	  
		  dto.process();
		  
	  }
  }
  void delete()
  {
	  String name;
	  System.out.print("������ �̸���? ");
	  sc.nextLine();
	  name = sc.nextLine();
	  int pos = find(name);
	  if(pos==-1)
	  {
		  System.out.println(name + "is not found");
	  }
	  else
	  {
		  dataList.remove(pos); //����
	  }
  }
}