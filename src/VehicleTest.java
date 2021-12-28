import java.util.*;

public class VehicleTest {
	
	public static void main(String[] args) {
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
		Vehicle v1 = new Sedan("소나타");
		Vehicle v2 = new Suv("산타페");
		Vehicle v3 = new Truck("포터");
		Vehicle v4 = new Sedan("K5");
		Vehicle v5 = new Truck("봉고");
	
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		// 아래와 같이 생성 후 추가해도 됨.
//		vList.add(new Sedan()); 7라인 또는 10라인과 동일
		for( Vehicle v : vList ) { //향상된 for 구문
			v.move(); // 각각의 객체에 맞게 호출됨(다형성)
		}
		
		}
	
}
