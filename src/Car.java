
public class Car {
	
	String name; //멤버변수
	int speed;
	
	public Car() {
		name = "자동차";
		speed = 150;
		
	}
	
	public Car(String n) {
		name = n;
	}
	
	public Car(int s) {
		speed = s;
	}
	
	public Car(String cName, int cSpeed) {
		name = cName;    // 매개변수
		speed = cSpeed;
	}
	
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	
	
	public void setCar(String cName, int cSpeed) {
		name = cName;
		speed = cSpeed;
		
	}
	
	public void setSpeedup(int cSpeed) {
		speed += cSpeed;
	}
	
	public void setSpeeddown(int cSpeed) {
		speed -= cSpeed;
	}
	
}