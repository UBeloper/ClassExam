import java.util.*;

// Ŭ���� ����
public class Students {
	
	// 1. �������
	private int studentID;
	private String studentName;
	
	// ���� ������ ���� �𸣱⶧���� (���� ����Ȯ) ArrayList ���
	ArrayList<Subject> subjectList; // ���񺯼� subjectList // import ����� ArrayList ��밡��

	
	
	// 2. ������ ai) ����Ʈ������ ����簡 ���簡
	public Students() {
		
	}
	
	// �����ε��� ������
	public Students(int studentID, String studentName) { 	// �ΰ� �����°� ������ ������
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); 			// ???????????????????????????????????????	
	}														// �ڵ���� '����'�� ������ �����غ���
	
	
	// 3. �޼���
	// ������ ������ �߰��ϴ� �޼���� �л����� ���� ó����
	public void addSubject(String name, int score) {		// ??????????????????????????????????
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);			// add �� ArrayListŬ������ ���� �����ϴ� �ż���
	}										// ��� �ϳ��� �迭�� �߰��ϴ� �޼���
	
	public void showStudentInfo() {
		int total = 0; // ���� ��� ��������

		System.out.println("===========================================");
		System.out.println(studentName + ":" + studentID);
		
		for ( /*�ӽú��� s*/ Subject s : subjectList) {	// ����� ���� ����ŭ �ݺ�! //== for (int i = 0; i < subjectList.size(); i++) {} 
																						
			total += s.getScorePoint();					// ���� ����
			
			System.out.print(s.getName() + ":" + s.getScorePoint());
		}
		System.out.println();
		System.out.println("���� : " + total);
		System.out.println("��� : " + total/subjectList.size());
		System.out.println("===========================================");
		
	}
	
	
	
	
}
