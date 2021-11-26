
public class StudentArray {

	public static void main(String[] args) {

		// student info 배열 객체 생성, 배열할 개수 4개 // 인덱스 번호는 0부터 3까지
		Student studentInfo[] = new Student[4];

		// 객체 생성 및 초기화(초기값 선언) 형태
		studentInfo[0] = new Student("일훈", 100, "서울시", "일후니");
		studentInfo[1] = new Student("이훈", 90, "청주시", "이후니");
		studentInfo[2] = new Student("삼훈", 80, "대전시", "삼후니");
		studentInfo[3] = new Student("사훈", 70, "세종시", "사후니");
		
		

		for(int i = 0; i < studentInfo.length; i++ ) {			
			System.out.println("이름 : " + studentInfo[i].getStudentName());
			System.out.println("점수 : " + studentInfo[i].getGrade());
			System.out.println("주소 : " + studentInfo[i].getAddress());
			System.out.println("이름 : " + studentInfo[i].getNickName());
			System.out.println("시리얼넘버 : " + studentInfo[i].getStudentID());
			System.out.println(studentInfo[i].getStudentName() +", " + studentInfo[i].getGrade()+"점" + ", " + studentInfo[i].getAddress() +", 별명 : "+studentInfo[i].getNickName());
			System.out.println();
		}
		
		
		// set을 써서 이름 바꿔서 Test // 나머지 set은 귀찮아서 못만들겠다........
		
		studentInfo[0].setStudentName("오훈");
		studentInfo[1].setStudentName("육훈");
		studentInfo[2].setStudentName("칠훈");
		studentInfo[3].setStudentName("팔훈");

		for(int i = 0; i < studentInfo.length; i++ ) {		
			System.out.println();
			System.out.println("이름 : " + studentInfo[i].getStudentName());
			System.out.println("점수 : " + studentInfo[i].getGrade());
			System.out.println("주소 : " + studentInfo[i].getAddress());
			System.out.println("이름 : " + studentInfo[i].getNickName());
		}
		
		
	}

}
