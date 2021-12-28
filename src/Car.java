
public class Car {
	
	String name; //멤버변수 : 멤버 변수 선언 : 데이터가 실제 저장되는 곳
	int speed;
	
	public Car() {
		name = "자동차";
		speed = 150;
		
	}
	
	public Car(String n) {		// 생성자 : 변수를 초기화 하는 역할, 타입 사용 안함, 변수에 데이터를 맨 처음 저장할 때 사용
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
	
	
	public void setCar(String cName, int cSpeed) {		// 메소드 : 인스턴스 변수에 저장된 속성 값을 수정하거나 조회하는 역할
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