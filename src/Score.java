
public class Score {
	String name;
	int langscore;
	int engscore;			 // lang eng math 이렇게 할 걸^^;
	int mathscore;

	// int total/avg > 멤버변수에 안넣고 지역변수에 넣는 이유 
	// 			   		1. 멤버변수는 곧 'set'을 할 수 있어야하는데 '총점'이란 것이 'set'에 부적절하기 때문
	//  		  	 	2. 나중에 오류생기기도 쉽다. 갱신이 안되고 처음 생성할때 데이터로 머무르거나 불일치 할 수 있기 때문!!
	// 					3. 즉, 총점을 알고 싶니? 그러면 기존 점수를 더한걸로 알아라! 하는 것. '원래 점수'가 실체지, 총점 평균은 오리지널 데이터가 아니라 원래값으로 구하는 것이다.
	//					4. ***** 불필요한 멤버변수를 빼고, 메서드를 강화시키는 것이 좋은 프로그래밍이다.
	
	
	
	
	// 생성자
	
	public Score() {
		name = "홍길동";
		langscore = 70;
		engscore = 70;
		engscore = 70;
		
	}
	
	public Score(String sName, int sLangscore, int sEngscore, int sMathscore) {
		name = sName;
		langscore = sLangscore;
		engscore = sEngscore;
		mathscore = sMathscore;
	}
	
	// 매서드

	// set
	public void setName(String sName) {						// set은 public void!!! 
		name = sName;
	}

	public void setLangscore(int sLangscore) {
		langscore = sLangscore;
	}
	
	public void setEngscore(int sEngscore) {
		engscore = sEngscore;
	}
	
	public void setMathscore(int sMathscore) {
		mathscore = sMathscore;
	}
	
	
	// get
	public String getName() {								// get은 return!!!
		return name;
	}
	
	public int getLangscore() {
		return langscore;
	}
	
	public int getEngscore() {
		return engscore;
	}

	public int getMathscore() {
		return mathscore;
	}
	
	// 내가 한 총점 평균
	
	public int getTotal() {
		int total = langscore + engscore + mathscore;                        // 맞다.............
		return total;														 // 지역변수
				
	}
	
	public double getAvg() {
		double average = (langscore + engscore + (double)mathscore)/3;		
		return average;
	} 
	
	// ★★★쌤의 총점 평균★★★
	
//	public int getTotal() {
//		return langscore + engscore + mathscore;                   // 이걸 그냥 호출할떄 던져준다(return)!!
//	}															   // 호출할때 되돌려준다?!
//	
//	public double getAvg() {
//		return (double)getTotal()/3;
//	}			
	
}



