
public class Bike {
	
	String name;
	int speed;
	int price;						// 멤버 변수 : 멤버 변수 선언 : 데이터가 실제 저장되는 곳
	
	// 디폴트 생성자
	
	public Bike() {
		
	}
	
	public Bike(String bName, int bSpeed, int bPrice) {
		name = bName;
		speed = bSpeed;
		price = bPrice;
	}															// 생성자 : 변수를 초기화 하는 역할, 타입 사용 안함, 변수에 데이터를 맨 처음 저장할 때 사용
	
	public String getName() {
		return name; 
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setBike(String bName, int bSpeed, int bPrice) {
		name = bName;
		speed = bSpeed;
		price = bPrice;											// 메소드 : 인스턴스 변수에 저장된 속성 값을 수정하거나 조회하는 역할
		 
	}
	
	public void setSpeedup(int bSpeed) {
		speed += bSpeed;
	}

}
