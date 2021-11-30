import java.util.*;

// 클래스 구현
public class Students {
	
	// 1. 멤버변수
	private int studentID;
	private String studentName;
	
	// 과목 들을지 말지 모르기때문에 (갯수 부정확) ArrayList 사용
	ArrayList<Subject> subjectList; // 과목변수 subjectList // import 써줘야 ArrayList 사용가능

	
	
	// 2. 생성자 ai) 디폴트생성자 만들든가 말든가
	public Students() {
		
	}
	
	// 오버로딩된 생성자
	public Students(int studentID, String studentName) { 	// 두개 나오는거 저장할 생성자
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); 			// ???????????????????????????????????????	
	}														// 코드들의 '목적'을 가만히 생각해보기
	
	
	// 3. 메서드
	// 과목명과 점수를 추가하는 메서드★ 학생마다 각각 처리★
	public void addSubject(String name, int score) {		// ??????????????????????????????????
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);			// add 는 ArrayList클래스에 원래 존재하는 매서드
	}										// 요소 하나를 배열에 추가하는 메서드
	
	public void showStudentInfo() {
		int total = 0; // 총점 계산 지역변수

		System.out.println("===========================================");
		System.out.println(studentName + ":" + studentID);
		
		for ( /*임시변수 s*/ Subject s : subjectList) {	// 저장된 원소 수만큼 반복! //== for (int i = 0; i < subjectList.size(); i++) {} 
																						
			total += s.getScorePoint();					// 총점 누적
			
			System.out.print(s.getName() + ":" + s.getScorePoint());
		}
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total/subjectList.size());
		System.out.println("===========================================");
		
	}
	
	
	
	
}
