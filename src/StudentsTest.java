
public class StudentsTest {

	public static void main(String[] args) {
		
		// �л�, ���� Ŭ���� �׽�Ʈ (���� ����)
		Students st1 = new Students(1001, "ȫ�浿"); // Students Ŭ���� (����) ����! - ������
		st1.addSubject("����", 90);
		st1.addSubject("����", 85);
		
		Students st2 = new Students(1002, "���"); // ���� ����!
		st2.addSubject("����", 90);
		st2.addSubject("����", 85);
		st2.addSubject("����", 90);
		
		st1.showStudentInfo();
		st2.showStudentInfo();
		

	}

}
