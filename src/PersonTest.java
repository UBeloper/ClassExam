
public class PersonTest {
	
	public static void main(String[] args) {
		// Person Ŭ���� �׽�Ʈ
		Person hu1 = new Person(); // new Person(); <<< ������, ����Ʈ ������.
		// �����ε��� �����ڰ� ���� ��� ����Ʈ �����ڵ� �����ؾ� ��( ���� ��� ��. ������� ����� ������.)
		
		Person hu2 = new Person("ȫ�浿"); // �Ű����� 1�� ������
		
		System.out.println(hu2.getName());
		
		
		// �߰��� �޼��� ��� �׽�Ʈ 
		Person hu3 = new Person("���", 170, 70); // �߰��Ѱ� ��Ծ����.
		System.out.println("���� : "+ hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight());
		hu3.setPerson("���", 160, 80); // ******************* set >> �̰�ó�� �̸� / Ű / ������ �����ؼ� �ʱ�ȭ �� �� ����.
		System.out.println("���� : "+ hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight()); // ����� ������ ����!!!!
		
		hu1.setPerson("���", 150, 50); // �̹� ������� �ִ� hu1 // ��ü ����
		System.out.println("���� : "+ hu1.getName() + ", Ű : " + hu1.getHeight() + ", ������ : " + hu1.getWeight()); // ����� ������ ����!!!!

	}

}
