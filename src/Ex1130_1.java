
public class Ex1130_1 {
	public static void main(String[] args) {
		// 배열 복사
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");	    // 줄바꿈 없는거
		}
		
		System.out.println();						//줄바꿈 있는거
		
		
		// 어레이카피!!
		
		// ★★★★★★★★★★ 기본타입의 복사는 독립적 (int, double, float .... ) <-> 객체타입
		System.arraycopy(array1, 0, array2, 1, 4);
		// 원본과 대상은 각각 유지됨
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");			
		}
		
		System.out.println();
		
		// 배열 1 수정
		array1[2] = 300;
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");			
		}
		
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");			
		}
		
		System.out.println();
		
		// ★★★★★★★★ 객체 배열 복사 처리!!!
		
		Book bookArr1[] = new Book[3]; // Book 객체를 저장할 배열변수 ★선언
		Book bookArr2[] = new Book[3]; 
		
	
		// ★★★ (비교) 객체생성과 배열생성 ★★★
		// Book aaa = new Book("aaa", "bbb");	// 아랫줄!!
		// Book aaa;							// ★ 선언
		// aaa = new Book("aaa", "bbb");		// ★ 생성
		
		
		bookArr1[0] = new Book("태백산맥", "조정래"); // ★ 생성
		bookArr1[1] = new Book("데미안", "헤르만헤세"); // ★ 생성
		bookArr1[2] = new Book("어떻게 살 것인가", "유시민"); // ★ 생성
		
		
		
		
		// 얕은복사(객체배열이 조건)
		System.out.println("==========원본==========");
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		// 객체배열 어레이카피 - 얕은복사
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		// 사본 
		System.out.println("==========사본==========");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		
		// 값변경 - 얕은 복사 실험
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");
		
		System.out.println("==========원본==========");
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("==========사본==========");
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
