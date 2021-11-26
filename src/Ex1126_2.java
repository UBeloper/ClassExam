
public class Ex1126_2 {

	public static void main(String[] args) {
		// 아스키코드 연속출력
		char[] alpha = new char[26];
		char ch = '0'; 						
									 // 저장용 시작문자
									 // 노가다 방식 배열 alpha[0] = 'A', alpha[1] = 'B' ... 'H' ... 'Z'
		
		
		
//		ch++; // 그냥 얘 자체가 숫자값과 양면성을 띄는구나. 
		
//		System.out.println(ch);
		
		for(int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;					// ch 값을 alpha라는 배열의 i번째에 저장한다. 처음 초기화한 값 A를 0번에 저장하기 시작해서 Z값을 25번에 저장하는거 까지.
		}

//		System.out.println(alpha[0]);
//		System.out.println(alpha[25]);
//		System.out.println((int)alpha[4]);
	
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]+":"+(int)alpha[i]);
		}
		
		
		
		
	}

}
