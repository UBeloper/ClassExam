
// 단순 데이터 저장용으로 만든거기 때문에 생성자도 없음.
// 하다보면 이런 클래스가 많아지겠군.

public class Subject {
	// 멤버변수
	private String name;
	private int scorePoint;
	
	// 생성자 생략
	
	
	// 메서드 // 게터 세터 메서드
	
	public String getName() {
		return name;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	
	
}
