
public class StudentArray {

	public static void main(String[] args) {

		// student info �迭 ��ü ����, �迭�� ���� 4�� // �ε��� ��ȣ�� 0���� 3����
		Student studentInfo[] = new Student[4];

		// ��ü ���� �� �ʱ�ȭ(�ʱⰪ ����) ����
		studentInfo[0] = new Student("����", 100, "�����", "���Ĵ�");
		studentInfo[1] = new Student("����", 90, "û�ֽ�", "���Ĵ�");
		studentInfo[2] = new Student("����", 80, "������", "���Ĵ�");
		studentInfo[3] = new Student("����", 70, "������", "���Ĵ�");
		
		

		for(int i = 0; i < studentInfo.length; i++ ) {			
			System.out.println("�̸� : " + studentInfo[i].getStudentName());
			System.out.println("���� : " + studentInfo[i].getGrade());
			System.out.println("�ּ� : " + studentInfo[i].getAddress());
			System.out.println("�̸� : " + studentInfo[i].getNickName());
			System.out.println("�ø���ѹ� : " + studentInfo[i].getStudentID());
			System.out.println(studentInfo[i].getStudentName() +", " + studentInfo[i].getGrade()+"��" + ", " + studentInfo[i].getAddress() +", ���� : "+studentInfo[i].getNickName());
			System.out.println();
		}
		
		
		// set�� �Ἥ �̸� �ٲ㼭 Test // ������ set�� �����Ƽ� ������ڴ�........
		
		studentInfo[0].setStudentName("����");
		studentInfo[1].setStudentName("����");
		studentInfo[2].setStudentName("ĥ��");
		studentInfo[3].setStudentName("����");

		for(int i = 0; i < studentInfo.length; i++ ) {		
			System.out.println();
			System.out.println("�̸� : " + studentInfo[i].getStudentName());
			System.out.println("���� : " + studentInfo[i].getGrade());
			System.out.println("�ּ� : " + studentInfo[i].getAddress());
			System.out.println("�̸� : " + studentInfo[i].getNickName());
		}
		
		
	}

}
