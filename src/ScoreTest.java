
public class ScoreTest {
	public static void main(String[] args) {
		Score student1 = new Score();
				
		// set test
		
		System.out.println(student1.getName());  // ����Ʈ�� ���� ����
			
		student1.setName("������");				// set���� �� �Է� �ʱ�ȭ
		student1.setLangscore(90);
		student1.setEngscore(85);
		student1.setMathscore(95);
		
		System.out.println(student1.getName() + 
				"�� ���������� " + student1.getLangscore() + 
				"�̰�, ���������� " + student1.getEngscore() + 
				"�̰�, ���������� " + student1.getMathscore() + "�Դϴ�.");
		
		
		// student2 test
		
		Score student2 = new Score("��ܺ�", 100, 90, 90);
		System.out.println(student2.getName() + 
				"�� ���������� " + student2.getLangscore() + 
				"�̰�, ���������� " + student2.getEngscore() + 
				"�̰�, ���������� " + student2.getMathscore() + "�Դϴ�.");
		
		
		// ������ ���
		
		System.out.println(student1.getTotal());
		System.out.println(student1.getAvg());
				
		System.out.println(student2.getTotal());
		System.out.println(student2.getAvg());
		
		student2.setEngscore(68);      // ��������� avg total �ȳְ�, �̷��� �ϴ� ����!!
		
		System.out.println(student2.getTotal());
		System.out.println(student2.getAvg());
		
	}

}
