
public class BookClassTest {
	public static void main(String[] args) { // 모든 클래스는 object클래스를 상속받으므로 오라클에서 본 메소드 사용가능
		BookClass book = new BookClass(123456, "개미");
		System.out.println(book.toString()); // toString 메소드 작동하나 확인.
		System.out.println(book); // 객체명을 출력하면 toString() 메소드와 동일한 결과 (생략된 것으로 간주)
		// ★★★★★★ 헐 이것도 재정의가 되네.....	
		
		
	}
	
	
}
