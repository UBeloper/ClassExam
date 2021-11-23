
public class AnimalTest {
	public static void main(String[] args) {

	
	Animal a1 = new Animal();
	Animal a2 = new Animal("사자", 70);
	Animal a3 = new Animal("호랑이", 60);
	Animal a4 = new Animal("코끼리", 150);
	Animal a5 = new Animal("기린", 200);

	//디폴드값 테스트
	System.out.println(a1.getName());
	System.out.println(a1.getSpeed());
	
	// 디폴트값에 새로운 동물 넣기
	a1.setName("원숭이");
	a1.setWeight(40);
	a1.setSpeed(25);
	System.out.println(a1.getName()+"의 몸무게는 "+ a1.getWeight() + "kg 이고, 속도는 "+ a1.getSpeed() + "이다.");
	
	System.out.println(a2.getName());
	System.out.println(a3.getName() + "의 몸무게는 " + a3.getWeight() + "kg 입니다.");
	System.out.println(a4.getName());
	System.out.println(a4.getWeight());
	
	// 사자 속도 설정
	a2.setSpeed(40);
	System.out.println(a2.getSpeed());
	
	//사자 속도 감소
	a2.setSpeedUp(10);
	System.out.println(a2.getSpeed());
	
	// 호랑이 속도 설정
	a3.setSpeed(50);
	System.out.println(a3.getSpeed());
	
	// 호랑이 속도 감소
	a3.setSpeedDown(20);
	System.out.println(a3.getSpeed());
	
	// 코끼리 속도
	a4.setSpeed(70);
	System.out.println(a4.getSpeed());
	
	// 코끼리 속도 100이상으로 증가
	a4.setSpeedUp(50);
	System.out.println(a4.getSpeed());
	
	
	a4.setSpeedDown(100);
	System.out.println(a4.getSpeed());
	
}
}
