
public class Car {
	
	String name; //�������
	int speed;
	
	public Car() {
		name = "�ڵ���";
		speed = 150;
		
	}
	
	public Car(String n) {
		name = n;
	}
	
	public Car(int s) {
		speed = s;
	}
	
	public Car(String cName, int cSpeed) {
		name = cName;    // �Ű�����
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