
public class Ex1123_2 {

	public static void main(String[] args) {
		// 인스턴스 생성해야 클래스 사용 가능
		// 형태 : 클래스명 변수명 = new 생성자();    // 형태 : 생성자 -> 클래스명
		// 디폴트 생성자는 클래스명과 동일하며 매개변수 없음
		
		Ex1123_1 cal1 = new Ex1123_1(); // 디폴트 생성자로 인스턴스 생성(객체 생성)
	
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		
		System.out.println(cal1.add(10,20));
		
		cal1.add(30, 40);
		System.out.println(cal1.add(30, 40));
		
		int test = cal1.add(1, 2); // ** 결과가 test에 반환!!
		System.out.println(test);
		
		cal1.product(20, 5);
		System.out.println(cal1.product(20, 5)); 	
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);				// 마지막 정보가 남음
		System.out.println(cal1.result);
			
					
	
		System.out.println(cal1.add());
		
		
		// 두번째 객체!!!
		
		Ex1123_1 cal2 = new Ex1123_1(3,5);
		System.out.println(cal2.add());
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.divide());
		
		//처음만든 매소드도 활용 가능!
		System.out.println(cal2.add(2,3));
		
		System.out.println(cal2.num1);
		System.out.println(cal2.num2);			// 객체에 저장된 정보
		System.out.println(cal2.result);		// 마지막 정보
		
		cal2.setNum1(50);
		System.out.println(cal2.num1);
				
		
		
		// 세번째 객체!!1
		
		Ex1123_1 cal3 = new Ex1123_1(10,5);
		// 10 + 5 = 15
		System.out.println("10 + 5 = " + cal3.add());											// X
		System.out.println(cal3.num1 +" + "+ cal3.num2 +" = "+ cal3.add());						// X 보안떄문
		System.out.println(cal3.getNum1() +" + "+ cal3.getNum2() +" = "+ cal3.add());  			// 나중에 보안때문에 일반적으로 get과 set을 쓰는것!!!!
		
		
		
		
		
		// 네번째 객체 생성 및 테스트
		
		// ★★★★★★★ 디폴트 생성자로 생성 후 매개변수(9,10) 추가하고 곱셈 출력 테스트 ★★★★★★★★★
		
		Ex1123_1 cal4 = new Ex1123_1();
		
		cal4.setNum1(9);
		cal4.setNum2(10);							// set을 일일이 적어놓는게 정석 (n1, n2)는 위험성이 높음.
		
		System.out.println(cal4.product());
		System.out.println(cal4.getNum1() +" * "+ cal4.getNum2() +" = "+ cal4.product());
		
		// ************ " 'set'한 뒤에 'get'한다!!!!!!!!!!!! " ********************
		
	}
}
