
public class DeskTop extends Computer {
	// 추상메서드를 상속받았을 경우 반드시 추상메서드를 구현해야 함.
	
	@ Override
	public void display() {
		System.out.println("Desktop display");
	}
	
	@ Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	
}
