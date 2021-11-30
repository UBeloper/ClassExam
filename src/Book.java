
public class Book {
	// ****보통의 형태 암기****
	// 멤버변수 (속성)
	// 디폴트 생성자
	// 오버로딩된 생성자
	// 메서드
	// 오버로딩된 메서드
	// (보통 사용안함) 진입점 : public static void main(String[] args) {}

	
	// 멤버변수
	private String bookName;
	private String author;      // get,set만으로 접근가능하도록 만듦.
	
	// 디폴트 생성자
	public Book() {
		
	}
	
//	public Book(String bookName) {
//		this.bookName = bookName;
//	}
	
	// 오버로딩된 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// 메서드			
	public String getBookName() {
		return bookName;										// 다음과 같이
																// get, set메서드 생성시 첫글자를 대문자로.
	}															// 다른 문자는 동일해야 함.
														
									
	public String getAuthor() {
		return author;
	}															// "get, set을 하나씩만 만드는게 규칙"
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 오버로딩된 메서드
	public void showBookInfo() {				//뭔가 출력하는 메소드를 만드는게 목적일 때 show 많이 씀.
																			// 이건 문자 규칙없음
		System.out.println(getBookName() + " - " + getAuthor());
	}
	
	
	
}
