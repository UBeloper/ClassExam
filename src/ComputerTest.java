
public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer(); // (X) 추상클래스는 '생성'의 대상이 아님.
		Computer c2 = new DeskTop(); 
		c2.turnOn();
		c2.display();
		c2.turnOff();
		c2.typing();
	
	
	}	
}
