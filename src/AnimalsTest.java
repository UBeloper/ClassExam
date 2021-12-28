import java.util.*;


class Animals {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}

}

class Human extends Animals{
	public void move() {  //메서드 오버라이딩
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("책을 읽는다.");
	}
}

class Tiger extends Animals{
	public void move() {  //메서드 오버라이딩
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class Eagle extends Animals{
	public void move() {  //메서드 오버라이딩
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날아간다.");
	}
}

public class AnimalsTest { //파일명과 동일한 클래스는  public 필요(단1개)
	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest();
		
		Animals[] animalArr = new Animals[10]; //배열 객체 생성
		
		for(int i = 0; i < 3; i++) {
			animalArr[i] = new Human();
		}
		
		for(int i = 3; i < 5; i++) {
			animalArr[i] = new Tiger();
		}
		
		for(int i = 5; i < 10; i++) {
			animalArr[i] = new Eagle();
		}
		
		for(int i = 0; i < animalArr.length; i++) {
			animalArr[i].move();
		}
		
//		for (int i = 0; i < 10; i++) {
//			aTest.moveAnimal(animalArr[i]);
//		}
//						
	//----------------------------------------------------------------------
	ArrayList<Animals> aniList = new ArrayList<Animals>();
	aniList.add(new Human()); //객체 생성하면서 배열에 추가
	aniList.add(new Tiger());
	aniList.add(new Eagle());
		
	for (Animals item : aniList) {
		item.move(); // 다형성에 의해 각각의 메서드 호출★★★★★★★★
		// item.readBook(); Human만이 가진거고, Animal로 업캐스팅이 되어있기 때문에 안됌. 이럴때 다운캐스팅 필요.
		
 	}
	// 여러 메서드가 혼재되어있는 상황에서 딱 맞는 메서드를 찾기위해서 <<< 다형성 때문에 이런일이 벌어진 것.
	
	for (int i = 0 ; i < aniList.size(); i++) {
		Animals item /*위에꺼랑 다른 지역변수*/ = aniList.get(i); // get >> "부모"객체를 받아낸 것.
		if ( item instanceof Human ) {
			Human h = (Human)item ; /* 현재 item의 타입을 알아내면 돼요. 어떻게 알아내는가 하면 instanceof라는 예약어 키워드를 이용한다. 휴먼과 같으면, 사람이라면 + 임시변수를 만들어서 실제 아이템에 들어있으니까 괄호로 캐스팅' */
			h.readBook();
		} else if /*아니면 타이거와 같으냐?*/ (item instanceof Tiger) {
			Tiger t = (Tiger)item;
			t.hunting();
		} else if (item instanceof Eagle) {  /* else라는 보장못하는게 문제. (나머지 다 독수리라는 보장을 못함) 비교를 정확하게 해줘야함. >>>> 그러므로 else if */
			Eagle e = (Eagle)item;
			e.flying();
		} else {  /* 남은건 아무것도 하지말아라..*/
			System.out.println("알 수 없는 오류입니다.");
		}
	}
	}
		
	//----------------------------------------------------
	//move 메서드 호출
	
	public void moveAnimal(Animals animal) {
		animal.move();  //다형성,실제로 다른 일을 실행
}	
}