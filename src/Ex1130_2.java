
public class Ex1130_2 {

	public static void main(String[] args) {

		// 깊은 복사!!! ( ★일반 복사!! )
		
		Book bookArr1[] = new Book[3];
		Book bookArr2[] = new Book[3]; 
		
		bookArr1[0] = new Book("태백산맥", "조정래"); 
		bookArr1[1] = new Book("데미안", "헤르만헤세"); 
		bookArr1[2] = new Book("어떻게 살 것인가", "유시민"); 

		// ★ 얕은 복사는 인스턴스를 생성하지 않고, 기존 인스턴스의 주소값만 복사했기 때문에 서로 값에 영향을 미쳐버림.
		// 인스턴스를 따로 생성한 후 요소 값을 복사해야 함 = 따로 객체 생성이 필요하다.
		
		for (int i = 0 ; i < bookArr2.length; i++) {
			bookArr2[i] = new Book();							// ★★★ 디폴트 생성자로 생성!!
		}
		
		System.out.println("==========원본==========");
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("==========사본==========");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		for (int i = 0; i < bookArr1.length; i++) {				// ★★ 원본 배열 길이만큼 배정(저장)
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		System.out.println("=======복사 후=======");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		// 원본 수정
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");
		
		System.out.println("======수정 후 원본==========");
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("======수정 후 사본==========");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		
		
		
		
		
	}

}
