
public class Book {
	// ****������ ���� �ϱ�****
	// ������� (�Ӽ�)
	// ����Ʈ ������
	// �����ε��� ������
	// �޼���
	// �����ε��� �޼���
	// (���� ������) ������ : public static void main(String[] args) {}

	
	// �������
	private String bookName;
	private String author;      // get,set������ ���ٰ����ϵ��� ����.
	
	// ����Ʈ ������
	public Book() {
		
	}
	
//	public Book(String bookName) {
//		this.bookName = bookName;
//	}
	
	// �����ε��� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// �޼���			
	public String getBookName() {
		return bookName;										// ������ ����
																// get, set�޼��� ������ ù���ڸ� �빮�ڷ�.
	}															// �ٸ� ���ڴ� �����ؾ� ��.
														
									
	public String getAuthor() {
		return author;
	}															// "get, set�� �ϳ����� ����°� ��Ģ"
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// �����ε��� �޼���
	public void showBookInfo() {				//���� ����ϴ� �޼ҵ带 ����°� ������ �� show ���� ��.
																			// �̰� ���� ��Ģ����
		System.out.println(getBookName() + " - " + getAuthor());
	}
	
	
	
}
