
// ���� �޼ҵ� ���� Ŭ������ ���ǳ�����
// Ŭ���� �̸��� �빮�� ���� // ������ �Ϲ������� Ŭ������ �����ϱ� ���� �ҹ��� ����!

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	// ������
	// �����ε��� ������
	// �ż���
	public void showStudentInfo() {          				// void ==> ��ȯ Ÿ�� ����(�������� ����(?))
		System.out.println(studentName + "===" + address);  // �� �ȿ� �ݺ���(?)������ �Ἥ �󸶳�
															// ����ϰ� ó���ϴ��İ� �ɷ�
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	// Student Ŭ������ ������ �ƴ�. ���� ���� �ʱ�ȭ�غ��� ���� �ȵǴ°� �� �� ����.
	public static void main(String[] args) {	 // ������!!! "�ü������ ���α׷� ȣ��"�ϴ� �������� ��� !!!!
											
		// ���� ���� **�ϱ�** Ŭ������ ������ = new ������()
		Student st1 = new Student();			 // st1 ������ �̿��ؼ� ���� Student Ŭ������ ������ ������ ��������

		// getStudentName(); �Ұ��� >> st1(��ü����)�� �̿��ؾ� ��.

		st1.setStudentName("ȫ�浿"); // st1 �̿��ؼ� studentName ������ ���� ��. �Ʒ��ٿ��� ����.
		st1.getStudentName();
		

		
		
		System.out.println(st1.studentName); // ������� ���� ��� - �ټ� ���ۿ��� ���� ���
		System.out.println(st1.getStudentName()); // �޼��带 Ȱ���ؼ� ���
		
	}
}
