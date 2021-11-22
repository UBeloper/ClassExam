
public class CarTest {

	public static void main(String[] args) {
		Car car3 = new Car();
		Car car1 = new Car("V1", 80);
		Car car2 = new Car("V2", 70);

		System.out.println(car3.getName());
		System.out.println(car3.getSpeed());
	
		
		System.out.println("���� : " + car1.getName());
		System.out.println("���� : " + car2.getName());

		System.out.println("�ӵ� : " + car1.getSpeed() + "km/h");
		System.out.println("�ӵ� : " + car2.getSpeed() + "km/h");

		System.out.println("���� : " + car1.getName() + ", �ӵ� : " + car1.getSpeed() + "km/h");
		System.out.println("���� : " + car2.getName() + ", �ӵ� : " + car2.getSpeed() + "km/h");

		car1.setCar("V3", 120);
		System.out.println("���� : " + car1.getName() + ", �ӵ� : " + car1.getSpeed() + "km/h");
		
		car1.setSpeedup(10);
		System.out.println(car1.getSpeed());
		
		car2.setSpeeddown(20);
		System.out.println(car2.getSpeed());

	}
}
