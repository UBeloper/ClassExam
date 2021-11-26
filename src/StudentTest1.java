
public class StudentTest1 {
	
	public static void main(String[] args) { //운영체제에서 이 라인을 먼저 찾음. "진입점"역할을 함, 필수!
		// Student 클래스 테스트
		
		Student st1 = new Student(); // 객체 생성 : default 생성자 - 클래스에 생성자가 없어도 디폴트생성자 자동으로 생성된걸로 생각함.
		
		st1.setStudentName("홍길동");
		System.out.println(st1.studentName); 		// 'public' 멤버변수 이므로 가능 (폴더 내 외부로부터의 접근 가능)
		System.out.println(st1.getStudentName());	// 'public 메서드'이므로 가능
		
		
//		st1.serialNum++; 							// st1을 지정했으나, 해보면 st1, st2 둘다 증가 >> 공통으로 증가하고 있구나.
//		System.out.println(Student.serialNum);			// serialNum 확인
		
		// serialNum을 정보은닉 (private)
		System.out.println(Student.getSerialNum());
		
		
		
													
													//★★★★★★★★★★★★★★★ 
													// st1 대신에 'Student'만 넣는게 가능한 전제는
													//변수가 'static'변수로 serialNum이 선언되어있기 때문.
		
				
		Student st2 = new Student();
		
		st2.setStudentName("김삿갓");
		System.out.println(st2.studentID);           // 김삿갓이나 홍길동이나 serialNum 같음 확인
														
														
		// getSerialNum활용
		System.out.println(Student.getSerialNum());
		
		// static 활용
//		System.out.println(Student.serialNum);
		System.out.println(st1.getStudentName());
		
		System.out.println(st2.getStudentName());
		System.out.println(st2.getStudentName() + " : " + st2.studentID);
		
		System.out.println(st1.getSerialNum());
		
		
		// ★★★★★★★★★★★★★
		//******* static을 사용하면, 심지어 객체 생성을 하지 않고도,  (객체생성과 무관)
		// System.out.println(Student.getSerialNum());이 가능하다. 물론 1000이 나올테지만.
		// 					 (		 .serialNum);은 안된다. private으로 묶여있기때문에 get통해서 우회접근해야한다.
		
		
		
		
		
	}
}
