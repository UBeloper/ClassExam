
// ���� �޼ҵ� ���� Ŭ������ ���ǳ�����
// Ŭ���� �̸��� �빮�� ���� // ������ �Ϲ������� Ŭ������ �����ϱ� ���� �ҹ��� ����!

public class Student {
	//11.26 �߰�
	private static int serialNum = 1000; // ���� ���� static => 1. �ݵ�� ����� ���ÿ� �ʱ�ȭ�� ��������Ѵ�.
										// 2.�ν��Ͻ�(��ü)������ ������ >> ��ü �������ص� main class���� �ٷ� ��°���!!
										// 3. ��� ��ü���� ���� 
										// 4. ex) �� ��ü���� 'stuID'�� ��� �ٸ���, serialNum�� ���� ������ ��� ����
										// 5. ��� : ��ü�� � �����Ǵ°�? ��ü�� ����ִ°�? Ȯ���� �� �ַ� ���
	
	
	
	public int studentID;
	
	public String studentName;
	public int grade;
	public String address;
	public String nickName;
	

	// ������
	
	public Student(String studentName, int grade, String address, String nickName) {
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
		this.nickName = nickName;
		serialNum++;
		studentID = serialNum;
		
	}
	// �����ε��� ������
	// �ż���
//	public void showStudentInfo() {          				// void ==> ��ȯ Ÿ�� ����(�������� ����(?))
//		System.out.println(studentName + "===" + address);  // �� �ȿ� �ݺ���(?)������ �Ἥ �󸶳�
//															// ����ϰ� ó���ϴ��İ� �ɷ�
//	}
	  
	
	// 11.26 static�� �̿�!! "������"ȭ ��Ű��(�� ��ü �ٸ������� �����ϱ�)
	public Student() {							// ������!!
//		serialNum++;
//		this.serialNum = serialNum;		//�̷����ϸ� �� �ȵ�? >> ����� ������ �ᱹ student serial���� ���ع����⶧�� // ID�� ����ϸ� �����ߴ� serialNum�� ���� ����.
//		studentID = serialNum;
	}
	
	

	

	public String getStudentName() {
		return studentName;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getStudentID() {
		return studentID;
	}
	


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {				// "static"�� ������ "Student."getSerialNum() ������ ������ �ȉ�.
		int i = 10; /// �������� ��밡��!
	//	this.studentName = "������"; // �ȵǴ� ���� : "static"�̱� ����.
		return serialNum;
	}

}
//	// Student Ŭ������ ������ �ƴ�. ���� ���� �ʱ�ȭ�غ��� ���� �ȵǴ°� �� �� ����.
//	public static void main(String[] args) {	 // ������!!! "�ü������ ���α׷� ȣ��"�ϴ� ����!!
//											
//		// ���� ���� **�ϱ�** Ŭ������ ������ = new ������()
//		Student st1 = new Student();			 // st1 ������ �̿��ؼ� ���� Student Ŭ������ ������ ������ ��������
//
//		// getStudentName(); �Ұ��� >> st1(��ü����)�� �̿��ؾ� ��.
//
//		st1.setStudentName("ȫ�浿"); // st1 �̿��ؼ� studentName ������ ���� �ȴ�. �Ʒ��ٿ��� ����.
//		st1.getStudentName();
//		
//
//		
//		
//		System.out.println(st1.studentName); // ������� ���� ��� - �ټ� ���ۿ��� ���� ���
//		System.out.println(st1.getStudentName()); // �޼��带 Ȱ���ؼ� ���
//		
//	}
//}
	
	
