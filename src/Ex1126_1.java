
public class Ex1126_1 {

	public static void main(String[] args) {

		int[] stIDs = new int[10]; // 정수형 배열선언(초기화 안 한 상태)
									// studentID들 10개를 배열 선언 - '배열그림'을 만들고 거기에 4바이트씩 저장.

		int[] stArr1 = { 101, 102, 103, 104, 105 }; // 배열 선언과 동시에 초기화 1
		int[] stArr2 = new int[] { 101, 102, 103 }; // 배열 선언과 동시에 초기화 2

		int[] stArr3; // 일단 선언
		stArr3 = new int[] { 101, 102, 103 }; // 배열 선언 동시에 초기화를 두줄에 씀. new생략 불가.

//		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
	
		
		
		
		// 배열 초기화 하고 출력하기
		for(int i = 0; i < 5; i++) {			// 다음턴부터 1이 되는거같다. 그래서 0~4번까지의 배열이 출력되는거겠지.
			System.out.println(stArr1[i]);  	// ★ index는 0부터 // 범위 i < 6하면 오류난다. 인수가 5개인데 0~5까지는 6개잖아. 바운더리 오류.
												 
		}
		
//		System.out.println(i);					// 나올 수가 없음. 위의 int i는 저 문장안에서만 영향범위임.
//		int i = 20;								// 가능. 다른 애다. 위에 애랑 관련없는 애다.
//		for(int i = 2; i <= 4; i++) {
//			System.out.println(stArr1[i]);		// 당연히 가능
//		}
	
		
	
	
	
	
	
	
	
	}

}
