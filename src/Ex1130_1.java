
public class Ex1130_1 {
	public static void main(String[] args) {
		// �迭 ����
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");	    // �ٹٲ� ���°�
		}
		
		System.out.println();						//�ٹٲ� �ִ°�
		
		
		// ���ī��!!
		
		// �ڡڡڡڡڡڡڡڡڡ� �⺻Ÿ���� ����� ������ (int, double, float .... ) <-> ��üŸ��
		System.arraycopy(array1, 0, array2, 1, 4);
		// ������ ����� ���� ������
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");			
		}
		
		System.out.println();
		
		// �迭 1 ����
		array1[2] = 300;
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");			
		}
		
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");			
		}
		
		System.out.println();
		
		// �ڡڡڡڡڡڡڡ� ��ü �迭 ���� ó��!!!
		
		Book bookArr1[] = new Book[3]; // Book ��ü�� ������ �迭���� �ڼ���
		Book bookArr2[] = new Book[3]; 
		
	
		// �ڡڡ� (��) ��ü������ �迭���� �ڡڡ�
		// Book aaa = new Book("aaa", "bbb");	// �Ʒ���!!
		// Book aaa;							// �� ����
		// aaa = new Book("aaa", "bbb");		// �� ����
		
		
		bookArr1[0] = new Book("�¹���", "������"); // �� ����
		bookArr1[1] = new Book("���̾�", "�츣���켼"); // �� ����
		bookArr1[2] = new Book("��� �� ���ΰ�", "���ù�"); // �� ����
		
		
		
		
		// ��������(��ü�迭�� ����)
		System.out.println("==========����==========");
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		// ��ü�迭 ���ī�� - ��������
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		// �纻 
		System.out.println("==========�纻==========");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		
		// ������ - ���� ���� ����
		bookArr1[0].setBookName("����");
		bookArr1[0].setAuthor("�ڿϼ�");
		
		System.out.println("==========����==========");
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("==========�纻==========");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
