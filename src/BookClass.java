
public class BookClass { // '���!!! Ŭ������' 'Object Ŭ������ ����Ŭ����' => �׷��ϱ� �޼ҵ带 ����� �� �ִ°���. ��~~
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override // �������̵��� �޼���ϱ� �Ű��� ���� >> ��Ÿ���°� ����.
	
	public String toString() {     					// ������
		return bookTitle + " , " + bookNumber;
	}
	
	
}
