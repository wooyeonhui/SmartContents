package ObjectGradeProcessing;

//�ѻ�� �з��� ������ �ϳ��� ���´�
public class ScoreData {
	
	private String name;
	private String idnum;
	private int write ; //�ʱ�
	private int word ; //����
	private int ppt; 
	private int spread;
	private int total;
	private String grade ;

	public void calc()
	{
		total = write + word + ppt + spread;
		if(total>=800)
		{
			grade = "A���";
		}else if(total>=600)
		{
			grade = "B���";
		}else if(total>=400)
		{
			grade = "C���";
		}else
		{
			grade = "D���, ����� ���";
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public int getWrite() {
		return write;
	}
	public void setWrite(int write) {
		this.write = write;
	}
	public int getWord() {
		return word;
	}
	public void setWord(int word) {
		this.word = word;
	}
	public int getPpt() {
		return ppt;
	}
	public void setPpt(int ppt) {
		this.ppt = ppt;
	}
	public int getSpread() {
		return spread;
	}
	public void setSpread(int spread) {
		this.spread = spread;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {		
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}