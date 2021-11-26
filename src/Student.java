
// 메인 메소드 없이 클래스만 정의내리기
// 클래스 이름은 대문자 시작 // 변수는 일반적으로 클래스와 구분하기 위해 소문자 시작!

public class Student {
	//11.26 추가
	private static int serialNum = 1000; // 정적 변수 static => 1. 반드시 선언과 동시에 초기화를 시켜줘야한다.
										// 2.인스턴스(객체)생성과 무관함 >> 객체 생성안해도 main class에서 바로 출력가능!!
										// 3. 모든 객체에서 공용 
										// 4. ex) 각 객체에서 'stuID'는 모두 다르나, serialNum은 같은 값으로 모두 공유
										// 5. 사용 : 객체가 몇개 생성되는가? 객체가 살아있는가? 확인할 때 주로 사용
	
	
	
	public int studentID;
	
	public String studentName;
	public int grade;
	public String address;
	public String nickName;
	

	// 생성자
	
	public Student(String studentName, int grade, String address, String nickName) {
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
		this.nickName = nickName;
		serialNum++;
		studentID = serialNum;
		
	}
	// 오버로딩된 생성자
	// 매서드
//	public void showStudentInfo() {          				// void ==> 반환 타입 없음(정해지지 않음(?))
//		System.out.println(studentName + "===" + address);  // 이 안에 반복문(?)따위를 써서 얼마나
//															// 깔끔하게 처리하느냐가 능력
//	}
	  
	
	// 11.26 static을 이용!! "고유값"화 시키기(각 객체 다른변수로 간직하기)
	public Student() {							// 생성자!!
//		serialNum++;
//		this.serialNum = serialNum;		//이렇게하면 왜 안돼? >> 출력은 되지만 결국 student serial값이 변해버리기때문 // ID를 출력하면 간직했던 serialNum이 나올 것임.
//		studentID = serialNum;
	}
	
	

	

	public String getStudentName() {
		return studentName;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getStudentID() {
		return studentID;
	}
	


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {				// "static"이 없으면 "Student."getSerialNum() 따위로 접근이 안됌.
		int i = 10; /// 지역변수 사용가능!
	//	this.studentName = "강감찬"; // 안되는 이유 : "static"이기 때문.
		return serialNum;
	}

}
//	// Student 클래스의 영역이 아님. 위의 변수 초기화해보면 실행 안되는걸 알 수 있음.
//	public static void main(String[] args) {	 // 진입점!!! "운영체제에서 프로그램 호출"하는 목적!!
//											
//		// 실행 형태 **암기** 클래스명 변수명 = new 생성자()
//		Student st1 = new Student();			 // st1 변수를 이용해서 위의 Student 클래스의 정보에 접근이 가능해짐
//
//		// getStudentName(); 불가능 >> st1(객체변수)를 이용해야 함.
//
//		st1.setStudentName("홍길동"); // st1 이용해서 studentName 변수에 저장 된다. 아랫줄에서 실험.
//		st1.getStudentName();
//		
//
//		
//		
//		System.out.println(st1.studentName); // 멤버변수 직접 출력 - 다소 부작용이 많은 방식
//		System.out.println(st1.getStudentName()); // 메서드를 활용해서 출력
//		
//	}
//}
	
	
