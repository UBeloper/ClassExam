
public class Ex1130_3 {

	public static void main(String[] args) {
		// ���� ���� �ǽ�
		
		// ��ü ���� �� ����
		Book bookArr1[] = new Book[3];
		Book bookArr2[] = new Book[3];

		bookArr1[0] = new Book("�¹���", "������");
		bookArr1[1] = new Book("��� �� ���ΰ�", "���ù�");
		bookArr1[2] = new Book("���̾�", "�츣���켼");
		
		// ���� for�� // �Ϲ� Ÿ�� => �迭 ������ ���ÿ� �ʱ�ȭ ���� ���� üũ // >> 75�� ����
		String strArr[] = {"�ڹ�", "�ȵ�", "C", "�ڹٽ�ũ��Ʈ", "���̽�"}; 
		
		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();

		
		// ���� ��
		System.out.println();
		for (String lang : bookArr1.getBookName()) {
			System.out.println(lang);
//			System.out.println(bookArr1[i].getBookName());
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}

		
		// ���� ��
		System.out.println();
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}

		// �纻�� ����° å ����
		System.out.println();
		bookArr2[2].setBookName("�ڹ����α׷���");
		bookArr2[2].setAuthor("ȫ�浿");
		
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		// ���� �ι��� å
		System.out.println();
		bookArr1[1].setBookName("�ڹ�");
		bookArr1[1].setAuthor("���");
		
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		// ���� for��
		System.out.println(); // �ٹٲ�
		
		for (String lang : strArr) {			// strArr �迭�� ��Ұ� lang�� ����
			System.out.println(lang);
		}
	
	
	
	
	
	}

}
