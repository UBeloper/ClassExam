
public class Score {
	String name;
	int langscore;
	int engscore;			 // lang eng math �̷��� �� ��^^;
	int mathscore;

	// int total/avg > ��������� �ȳְ� ���������� �ִ� ���� 
	// 			   		1. ��������� �� 'set'�� �� �� �־���ϴµ� '����'�̶� ���� 'set'�� �������ϱ� ����
	//  		  	 	2. ���߿� ��������⵵ ����. ������ �ȵǰ� ó�� �����Ҷ� �����ͷ� �ӹ����ų� ����ġ �� �� �ֱ� ����!!
	// 					3. ��, ������ �˰� �ʹ�? �׷��� ���� ������ ���Ѱɷ� �˾ƶ�! �ϴ� ��. '���� ����'�� ��ü��, ���� ����� �������� �����Ͱ� �ƴ϶� ���������� ���ϴ� ���̴�.
	//					4. ***** ���ʿ��� ��������� ����, �޼��带 ��ȭ��Ű�� ���� ���� ���α׷����̴�.
	
	
	
	
	// ������
	
	public Score() {
		name = "ȫ�浿";
		langscore = 70;
		engscore = 70;
		engscore = 70;
		
	}
	
	public Score(String sName, int sLangscore, int sEngscore, int sMathscore) {
		name = sName;
		langscore = sLangscore;
		engscore = sEngscore;
		mathscore = sMathscore;
	}
	
	// �ż���

	// set
	public void setName(String sName) {						// set�� public void!!! 
		name = sName;
	}

	public void setLangscore(int sLangscore) {
		langscore = sLangscore;
	}
	
	public void setEngscore(int sEngscore) {
		engscore = sEngscore;
	}
	
	public void setMathscore(int sMathscore) {
		mathscore = sMathscore;
	}
	
	
	// get
	public String getName() {								// get�� return!!!
		return name;
	}
	
	public int getLangscore() {
		return langscore;
	}
	
	public int getEngscore() {
		return engscore;
	}

	public int getMathscore() {
		return mathscore;
	}
	
	// ���� �� ���� ���
	
	public int getTotal() {
		int total = langscore + engscore + mathscore;                        // �´�.............
		return total;														 // ��������
				
	}
	
	public double getAvg() {
		double average = (langscore + engscore + (double)mathscore)/3;		
		return average;
	} 
	
	// �ڡڡڽ��� ���� ��աڡڡ�
	
//	public int getTotal() {
//		return langscore + engscore + mathscore;                   // �̰� �׳� ȣ���ҋ� �����ش�(return)!!
//	}															   // ȣ���Ҷ� �ǵ����ش�?!
//	
//	public double getAvg() {
//		return (double)getTotal()/3;
//	}			
	
}



