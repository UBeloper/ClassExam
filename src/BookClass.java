
public class BookClass { // '모든!!! 클래스는' 'Object 클래스의 하위클래스' => 그러니까 메소드를 사용할 수 있는거지. 아~~
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override // 오버라이딩된 메서드니까 신경좀 써줘 >> 오타나는거 방지.
	
	public String toString() {     					// 재정의
		return bookTitle + " , " + bookNumber;
	}
	
	
}
