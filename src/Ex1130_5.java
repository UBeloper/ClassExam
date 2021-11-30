
import java.util.ArrayList; // ★★★★ ArrayList 사용할 때 선언해줘야 하는 것
// import java.util.*; 		// 위에꺼 아니면 밑에꺼 아무거나.


public class Ex1130_5 {
	public static void main(String[] args) {
		
		// ★★★★★★ArrayList 클래스 활용★★★★★★
		ArrayList<Book> library = new ArrayList<Book>(); 	// ArrayList 기본 형태 // <제네릭>타입으로 생성
				
		for (int i = 0; i < library.size(); i++) {			 
			// 임시변수로 반환
			Book book = library.get(i); // 객체를 반환
			book.showBookInfo();
		}
		
		// 값 주기 // 기존에 쓰던 방식, add 방식

//		Book abc = new Book("태백산맥", "조정래");		// 첫번째 방식
//		library.add(abc);

		library.add(new Book("태백산맥", "조정래")); 	// 두번째 방식
		library.add(new Book("데미안", "헤르만헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));

		System.out.println("============================");
		for (int i = 0; i < library.size(); i++) {			 
			// 임시변수로 반환 // 이부분 헷갈린다.......................................................
			Book book = library.get(i); // 객체를 반환
			book.showBookInfo();
		}

		System.out.println("============================");
		for (Book abc : library) {
			abc.showBookInfo();
		}
		
		
		
		
	}
}
