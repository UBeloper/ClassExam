
public class Animal {
	
	String name;
	int weight;											// 멤버변수
	int speed;
	
	// 생성자
	public Animal() {									// 디폴트 = 인수가 없다.
		name = "동물";
		weight = 30;
		speed = 0;
		
	}
	
	public Animal(String aName) {
		name = aName;
		weight = 30;										// 다른 값도 디폴트 값줘야한다!!!!
		speed = 0;
	}
	
	public Animal(String aName, int aWeight) {
		name = aName;
		weight = aWeight; 								    // 이름 체중 외 다른 값도 디폴트 값 줘야한다!!!
		speed = 0;
	}
		
	// 매서드 정의

	// set
	public void setName(String aName) {
		name = aName;
	}

	public void setWeight(int aWeight) {
		weight = aWeight;
	}
	
	public void setSpeed(int aSpeed) {
		speed = aSpeed;
	}

	// get
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}
	
	public int getSpeed() {
		return speed;									// get이나 set은 아무데나 갖다붙히지 않는게 좋다.
														// 상징적으로 의미가 많으니.
	}
	

	// 달리는 속도 증가
	
	// ★★★★★★★★★ speed에 정해지지 않은 '숫자' 증가하는 경우
	public void setSpeedUp(/*아무것도 안넣음*/) {     //특정 값을 넣는게 아니니까 아무것도 안넣고 숫자를 넣을 수 있는거지.
		if(speed + 10 > 100) {
		System.out.println("속도초과");}
		else {
			speed += 10;
		}
		
	}
	
	
	public void setSpeedUp(int aSpeed) {
		if(speed + aSpeed > 100) {						// speed > 100이 안되는 이유는, '지금 당장 speed에' 저장된 값이 100이 초과되어야 speed=100 이 되는 것!!! 
			System.out.println("속도초과");								// ★★★★★★★★★★★★★★★★★★★★★★★★★★★
		}else {
			speed += aSpeed;
		}
		
	}
	
	public void setSpeedDown(int aSpeed) {
		if(speed-aSpeed < 0) {
			System.out.println("속도미달");
		}else {											// ★★★★★★★★★★★★★★★★★★★★★★★★★★★
			speed -= aSpeed;
		}
		
	}
	
	
	
	
}
