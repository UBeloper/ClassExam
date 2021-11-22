
public class BikeTest {
	public static void main(String[] args) {
		Bike B1 = new Bike("B1", 70, 300000);     // 인스턴스 변수
		Bike B2 = new Bike("B2", 80, 400000);
		
		System.out.println("속도 : "+B1.getSpeed()+"km/h");
	
		B1.setBike("B3", 120, 588000);
		
		System.out.println("속도 : "+B1.getSpeed()+"km/h");
		
	
	}
	
		

}
