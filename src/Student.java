
// 메인 메소드 없이 클래스만 정의내리기
// 클래스 이름은 대문자 시작 // 변수는 일반적으로 클래스와 구분하기 위해 소문자 시작!

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	// 생성자
	// 오버로딩된 생성자
	// 매서드
	public void showStudentInfo() {          				// void ==> 반환 타입 없음(정해지지 않음(?))
		System.out.println(studentName + "===" + address);  // 이 안에 반복문(?)따위를 써서 얼마나
															// 깔끔하게 처리하느냐가 능력
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	// Student 클래스의 영역이 아님. 위의 변수 초기화해보면 실행 안되는걸 알 수 있음.
	public static void main(String[] args) {	 // 진입점!!! "운영체제에서 프로그램 호출"하는 목적으로 사용 !!!!
											
		// 실행 형태 **암기** 클래스명 변수명 = new 생성자()
		Student st1 = new Student();			 // st1 변수를 이용해서 위의 Student 클래스의 정보에 접근이 가능해짐

		// getStudentName(); 불가능 >> st1(객체변수)를 이용해야 함.

		st1.setStudentName("홍길동"); // st1 이용해서 studentName 변수에 저장 됌. 아랫줄에서 실험.
		st1.getStudentName();
		

		
		
		System.out.println(st1.studentName); // 멤버변수 직접 출력 - 다소 부작용이 많은 방식
		System.out.println(st1.getStudentName()); // 메서드를 활용해서 출력
		
	}
}
