
public class StudentTest1 {
	
	public static void main(String[] args) { //�ü������ �� ������ ���� ã��. "������"������ ��, �ʼ�!
		// Student Ŭ���� �׽�Ʈ
		
		Student st1 = new Student(); // ��ü ���� : default ������ - Ŭ������ �����ڰ� ��� ����Ʈ������ �ڵ����� �����Ȱɷ� ������.
		
		st1.setStudentName("ȫ�浿");
		System.out.println(st1.studentName); 		// 'public' ������� �̹Ƿ� ���� (���� �� �ܺηκ����� ���� ����)
		System.out.println(st1.getStudentName());	// 'public �޼���'�̹Ƿ� ����
		
		
//		st1.serialNum++; 							// st1�� ����������, �غ��� st1, st2 �Ѵ� ���� >> �������� �����ϰ� �ֱ���.
//		System.out.println(Student.serialNum);			// serialNum Ȯ��
		
		// serialNum�� �������� (private)
		System.out.println(Student.getSerialNum());
		
		
		
													
													//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� 
													// st1 ��ſ� 'Student'�� �ִ°� ������ ������
													//������ 'static'������ serialNum�� ����Ǿ��ֱ� ����.
		
				
		Student st2 = new Student();
		
		st2.setStudentName("���");
		System.out.println(st2.studentID);           // ����̳� ȫ�浿�̳� serialNum ���� Ȯ��
														
														
		// getSerialNumȰ��
		System.out.println(Student.getSerialNum());
		
		// static Ȱ��
//		System.out.println(Student.serialNum);
		System.out.println(st1.getStudentName());
		
		System.out.println(st2.getStudentName());
		System.out.println(st2.getStudentName() + " : " + st2.studentID);
		
		System.out.println(st1.getSerialNum());
		
		
		// �ڡڡڡڡڡڡڡڡڡڡڡڡ�
		//******* static�� ����ϸ�, ������ ��ü ������ ���� �ʰ�,  (��ü������ ����)
		// System.out.println(Student.getSerialNum());�� �����ϴ�. ���� 1000�� ����������.
		// 					 (		 .serialNum);�� �ȵȴ�. private���� �����ֱ⶧���� get���ؼ� ��ȸ�����ؾ��Ѵ�.
		
		
		
		
		
	}
}
