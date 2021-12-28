
public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999; // 인터페이스에서 선언한 변수는 상수로 변환됨.
	
	//메소드가 중요해.
	// 인터페이스에서 선언한 메서드는 추상메서드로 전환됨.
	
	// 접근제한자가 없는 이유 : 인터페이스는 막아놓으면 안되고 풀려있어야 하므로. 애초에 그런 목적이니까.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}