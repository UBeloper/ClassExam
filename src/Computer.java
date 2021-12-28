
public abstract class Computer {            // class보다 앞, 접근제한자 보다 뒤.
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끈다.");
	}
	
	
	
}
