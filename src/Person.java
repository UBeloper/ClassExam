
public class Person { // 'Person'을 정의 // 생성자 >> PersonTest.java

	String name;
	int height;
	int weight;

	// 생성자가 한개도 없을 경우 디폴트생성자가 존재함. >> 그래서 에러가 안나는 것.

	// * 생성자 작성 규칙
	// ① '클래스 명과 동일'해야 함
	// ② 반환타입이 없음(문법 없음)

	// 오버로딩된 생성자 >> PersonTest.java 에러 >> 오버로딩된 생성자가 있을 경우, 디폴트 생성자도 구현해야 함(내용없어도 됨.
	// 껍데기라도 만들어 놔야함)

	// >> 명시적으로 디폴트 생성자 필요
	public Person() {

	}

	public Person(String pName) { // 생성자 이름이 동일하면서, 매개변수가 다름(갯수, 타입, 순서 등 하여간 다르기만 하면 됌)
		name = pName;

	}
	// 오버로딩된 생성자 하나 더
	public Person(String pName, int pHeight, int pWeight) {
		name = pName; 							// 왼쪽 멤버변수, 오른쪽 지역변수 //
		height = pHeight;
		weight = pWeight;

		// 생성자이기 때문에 타입이 없는것.
	}
		// 여기서부터 메서드 이기 때문에 타입이 있어야 함.
	public String getName() {
		return name;
	}	
	
	
	
	// 키와 몸무게를 각각 추출 >> get 할 수 있는 메서드 추가
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	

	// 성명, 키, 몸무게를 변경 >> set할 수 있는 메서드 추가
	
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return; // 제어 반환(값은 없음) // 프로그래머에 따라 쓰고말고 함.
	}
	
	
}
