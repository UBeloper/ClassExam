
public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer(); // (X) �߻�Ŭ������ '����'�� ����� �ƴ�.
		Computer c2 = new DeskTop(); 
		c2.turnOn();
		c2.display();
		c2.turnOff();
		c2.typing();
	
	
	}	
}
