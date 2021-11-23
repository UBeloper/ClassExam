
public class ScoreTest {
	public static void main(String[] args) {
		Score student1 = new Score();
				
		// set test
		
		System.out.println(student1.getName());  // 디폴트값 들어갔나 실험
			
		student1.setName("고유비");				// set으로 값 입력 초기화
		student1.setLangscore(90);
		student1.setEngscore(85);
		student1.setMathscore(95);
		
		System.out.println(student1.getName() + 
				"의 국어점수는 " + student1.getLangscore() + 
				"이고, 영어점수는 " + student1.getEngscore() + 
				"이고, 수학점수는 " + student1.getMathscore() + "입니다.");
		
		
		// student2 test
		
		Score student2 = new Score("고단비", 100, 90, 90);
		System.out.println(student2.getName() + 
				"의 국어점수는 " + student2.getLangscore() + 
				"이고, 영어점수는 " + student2.getEngscore() + 
				"이고, 수학점수는 " + student2.getMathscore() + "입니다.");
		
		
		// 총점과 평균
		
		System.out.println(student1.getTotal());
		System.out.println(student1.getAvg());
				
		System.out.println(student2.getTotal());
		System.out.println(student2.getAvg());
		
		student2.setEngscore(68);      // 멤버변수에 avg total 안넣고, 이렇게 하는 이유!!
		
		System.out.println(student2.getTotal());
		System.out.println(student2.getAvg());
		
	}

}
