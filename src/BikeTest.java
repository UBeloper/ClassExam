
public class BikeTest {
	public static void main(String[] args) {
		Bike B1 = new Bike("B1", 70, 300000);     // �ν��Ͻ� ����
		Bike B2 = new Bike("B2", 80, 400000);
		
		System.out.println("�ӵ� : "+B1.getSpeed()+"km/h");
	
		B1.setBike("B3", 120, 588000);
		
		System.out.println("�ӵ� : "+B1.getSpeed()+"km/h");
		
		B2.setBike("B2-1", 100, 858050);
		System.out.println("�ӵ� : "+B2.speed+"km/h");
		
	
	}
	
		

}
