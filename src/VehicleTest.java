import java.util.*;

public class VehicleTest {
	
	public static void main(String[] args) {
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
		Vehicle v1 = new Sedan("�ҳ�Ÿ");
		Vehicle v2 = new Suv("��Ÿ��");
		Vehicle v3 = new Truck("����");
		Vehicle v4 = new Sedan("K5");
		Vehicle v5 = new Truck("����");
	
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		// �Ʒ��� ���� ���� �� �߰��ص� ��.
//		vList.add(new Sedan()); 7���� �Ǵ� 10���ΰ� ����
		for( Vehicle v : vList ) { //���� for ����
			v.move(); // ������ ��ü�� �°� ȣ���(������)
		}
		
		}
	
}
