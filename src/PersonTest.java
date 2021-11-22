
public class PersonTest {
	
	public static void main(String[] args) {
		// Person 클래스 테스트
		Person hu1 = new Person(); // new Person(); <<< 생성자, 디폴트 생성자.
		// 오버로딩된 생성자가 있을 경우 디폴트 생성자도 구현해야 함( 내용 없어도 됨. 껍데기라도 만들어 놔야함.)
		
		Person hu2 = new Person("홍길동"); // 매개변수 1개 생성자
		
		System.out.println(hu2.getName());
		
		
		// 추가된 메서드 기능 테스트 
		Person hu3 = new Person("김삿갓", 170, 70); // 추가한거 써먹어볼려고.
		System.out.println("성명 : "+ hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
		hu3.setPerson("김삿갓", 160, 80); // ******************* set >> 이것처럼 이름 / 키 / 몸무게 변경해서 초기화 할 수 있음.
		System.out.println("성명 : "+ hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight()); // 변경된 값으로 나옴!!!!
		
		hu1.setPerson("김삿갓", 150, 50); // 이미 만들어져 있는 hu1 // 객체 수정
		System.out.println("성명 : "+ hu1.getName() + ", 키 : " + hu1.getHeight() + ", 몸무게 : " + hu1.getWeight()); // 변경된 값으로 나옴!!!!

	}

}
