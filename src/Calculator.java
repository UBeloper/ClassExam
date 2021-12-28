

// "클래스"에서 "인터페이스"를 "구현한다."
// 클래스 . 구현 . 인터페이스명
// 하나의 인터페이스는 여러 클래스에서 구현이 가능하다.

public class Calculator implements Calc { //인터페이스에서 만들어놓은 메소드를 빈껍데기라도 만들어놓아야 에러가 없어진다.
										  // Calc 인터페이스의 모든 메서드를 '반드시' 구현해야 함. (몸체작성)
	public int add(int num1, int num2) {
		return num1 + num2; 						  // 리턴타입이 int이므로. 대충 0이라고 쓴 '껍데기 몸체'를 만든다.
	}
	
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if (num2 == 0) {
			return Calc.ERROR;
		} else {
		return num1 / num2;   // '모호'한 부분이 없어야한다.
		}
	
	}
		
}
