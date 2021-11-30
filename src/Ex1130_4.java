
public class Ex1130_4 {
	public static void main(String[] args) {
		
		
		// 다차원 배열
				
//		int arr[][] = new int[2][3];  // 2행 3열
		
		// 생성과 동시에 초기화 형태 기억	
		int arr[][] = { {1,2,3},{4,5,6} }; // 2행 3열
		
		
		// ★ 행 열 형태 기억 + 행열 가로로 출력하기
		
		for(int i = 0 ; i < arr.length ; i++) { // 행 // arr.length >> 행 숫자를 알아냄
			for(int j = 0; j < arr[i].length; j++) { //열 // arr[i].length >> 열 숫자를 알아냄
				
				System.out.print(arr[i][j] + " ");		// 옆으로 출력해보기 + 붙어버리니까 공백
			}
			
			System.out.println();						// 옆으로 출력해보기 여기다가 한칸띄우기
		}
		 
		System.out.println(arr[0][1]);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
