
public class BookArray {

	public static void main(String[] args) {
		// **** Book 배열 테스트
		
//			int[] aaa = new int[5];					// 비교하기위해, int이용한 배열객체생성.
			Book library[] = new Book[5];			//★★★★★★ "Book객체"를 저장할 수 있는 배열 객체 생성!!!!!

			for(int i = 0; i < library.length; i++) {
				System.out.println(library[i]);
			}
	
			library[0] = new Book("태백산맥", "조정래");     	// ****************
			library[1] = new Book("데미안", "헤르만헤세");     	// 
			library[2] = new Book("어떻게 살 것인가", "유시민"); // 객체 생성 및 초기화 형태
			library[3] = new Book("BookName", "Author");    // 
			library[4] = new Book("책이름", "저자");			// ****************
	
			for(int i = 0; i < library.length; i++) {
				library[i].showBookInfo();
			}
	
			for(int i = 0; i < library.length; i++) {		// "객체가 만들어진 뒤" 출력해보면 null이 아니라 다른 장소 주소가 뜸.
				System.out.println(library[i]);				// ********* null = 객체 만들어지지도 않았을 때 뜨는 것.
			}
	
	
	
	
	
	
	
	
	
	
	}

}
