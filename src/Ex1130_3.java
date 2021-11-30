
public class Ex1130_3 {

	public static void main(String[] args) {
		// 깊은 복사 실습
		
		// 객체 선언 및 생성
		Book bookArr1[] = new Book[3];
		Book bookArr2[] = new Book[3];

		bookArr1[0] = new Book("태백산맥", "조정래");
		bookArr1[1] = new Book("어떻게 살 것인가", "유시민");
		bookArr1[2] = new Book("데미안", "헤르만헤세");
		
		// 향상된 for문 // 일반 타입 => 배열 생성과 동시에 초기화 가능 형태 체크 // >> 75번 라인
		String strArr[] = {"자바", "안드", "C", "자바스크립트", "파이썬"}; 
		
		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();

		
		// 복사 전
		System.out.println();
		for (String lang : bookArr1.getBookName()) {
			System.out.println(lang);
//			System.out.println(bookArr1[i].getBookName());
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}

		
		// 복사 후
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

		// 사본의 세번째 책 변경
		System.out.println();
		bookArr2[2].setBookName("자바프로그래밍");
		bookArr2[2].setAuthor("홍길동");
		
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		// 원본 두번쨰 책
		System.out.println();
		bookArr1[1].setBookName("자바");
		bookArr1[1].setAuthor("김삿갓");
		
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		// 향상된 for문
		System.out.println(); // 줄바꿈
		
		for (String lang : strArr) {			// strArr 배열의 요소가 lang에 대입
			System.out.println(lang);
		}
	
	
	
	
	
	}

}
