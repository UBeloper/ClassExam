
public class BookArray {

	public static void main(String[] args) {
		// **** Book �迭 �׽�Ʈ
		
//			int[] aaa = new int[5];					// ���ϱ�����, int�̿��� �迭��ü����.
			Book library[] = new Book[5];			//�ڡڡڡڡڡ� "Book��ü"�� ������ �� �ִ� �迭 ��ü ����!!!!!

			for(int i = 0; i < library.length; i++) {
				System.out.println(library[i]);
			}
	
			library[0] = new Book("�¹���", "������");     	// ****************
			library[1] = new Book("���̾�", "�츣���켼");     	// 
			library[2] = new Book("��� �� ���ΰ�", "���ù�"); // ��ü ���� �� �ʱ�ȭ ����
			library[3] = new Book("BookName", "Author");    // 
			library[4] = new Book("å�̸�", "����");			// ****************
	
			for(int i = 0; i < library.length; i++) {
				library[i].showBookInfo();
			}
	
			for(int i = 0; i < library.length; i++) {		// "��ü�� ������� ��" ����غ��� null�� �ƴ϶� �ٸ� ��� �ּҰ� ��.
				System.out.println(library[i]);				// ********* null = ��ü ����������� �ʾ��� �� �ߴ� ��.
			}
	
	
	
	
	
	
	
	
	
	
	}

}
