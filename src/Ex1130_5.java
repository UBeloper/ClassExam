
import java.util.ArrayList; // �ڡڡڡ� ArrayList ����� �� ��������� �ϴ� ��
// import java.util.*; 		// ������ �ƴϸ� �ؿ��� �ƹ��ų�.


public class Ex1130_5 {
	public static void main(String[] args) {
		
		// �ڡڡڡڡڡ�ArrayList Ŭ���� Ȱ��ڡڡڡڡڡ�
		ArrayList<Book> library = new ArrayList<Book>(); 	// ArrayList �⺻ ���� // <���׸�>Ÿ������ ����
				
		for (int i = 0; i < library.size(); i++) {			 
			// �ӽú����� ��ȯ
			Book book = library.get(i); // ��ü�� ��ȯ
			book.showBookInfo();
		}
		
		// �� �ֱ� // ������ ���� ���, add ���

//		Book abc = new Book("�¹���", "������");		// ù��° ���
//		library.add(abc);

		library.add(new Book("�¹���", "������")); 	// �ι�° ���
		library.add(new Book("���̾�", "�츣���켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));

		System.out.println("============================");
		for (int i = 0; i < library.size(); i++) {			 
			// �ӽú����� ��ȯ // �̺κ� �򰥸���.......................................................
			Book book = library.get(i); // ��ü�� ��ȯ
			book.showBookInfo();
		}

		System.out.println("============================");
		for (Book abc : library) {
			abc.showBookInfo();
		}
		
		
		
		
	}
}
