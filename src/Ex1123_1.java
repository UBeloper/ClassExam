
public class Ex1123_1 {

	// 사칙연산기
	int result; // 연산결과저장용 속성
	int num1; // 계산에 사용되는 왼쪽 속성
	int num2; // 계산에 사용되는 오른쪽 속성

	// 생성자!! (**암기 : 클래스명과 동일, 반환타입 없음(그러므로 리턴도 없음/말그대로 '생성'이 목적, 나머지는 메서드와 동일)

	// 디폴트 생성자
	public Ex1123_1() {
	
	
	}

	// 매개변수가 있는 생성자
	public Ex1123_1(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	
	
	// *****데이터 쓰기 
	// " 너 이 일 하고서 그냥 끝내!"하는 목적 void
	public void setNum1(int n1) {
		num1 = n1;
		
	}

	public void setNum2(int n2) {
		num2 = n2;
	}
	

	
	// *****데이터 읽기 
	// 읽어야하므로 타입맞춰줘야 함 int
	public int getNum1() {			//인수는 없음. 호출하면 바로 읽어줘야 하기 때문.
		return num1;				// return
	}
	
	public int getNum2() {				//인수는 없음. 호출하면 바로 읽어줘야 하기 때문.
		return num2;
		
	}
	
	
	

	// 메소드 : '호출'을 하기위한 명칭 'add'를 설정

	public int add() {
		result = num1 + num2;					// 값을 받아오지 않아도 저장되어 있기 때문에 이렇게 쓸 수 있음.
		return result;
		
	}
	

	public int subtract() {
		result = num1 - num2;					
		return result;
		
	}

	public int product() {
		result = num1 * num2;					
		return result;
		
	}

	public int divide() {
		result = num1 / num2;					
		return result;
		
	}

	
	public int add(int n1, int n2) { // 하는일은 없고 내부적으로 인쇄만한다 > void // 보통은 반환을 받게되기에 반환타입 정수형 'int'를 둠.
		num1 = n1;
		num2 = n2;

		// result = n1 + n2; //이것도 가능
		result = num1 + num2; // 덧셈실행 // 보통은 반환을 받게되기에 반환타입 정수형 'int'를 둠. // **형태 : public 반환타입 메서드명 (매개변수
						     		// 리스트)
		return result; // **********그냥 외우자
						// **** 호출시 return을 씀, void로 바꾸면 에러가 안남

	}

	// 뺄셈 메서드

	public int subtract(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = num1 - num2;
		return result;
	}

	// 곱셈 메서드
	public int product(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = num1 * num2;
		return result;
	}

	// 나눗셈 매서드
	public int divide(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = num1 / num2;
		return result;
	}

}
