
public class AnimalTest {
	public static void main(String[] args) {

	
	Animal a1 = new Animal();
	Animal a2 = new Animal("����", 70);
	Animal a3 = new Animal("ȣ����", 60);
	Animal a4 = new Animal("�ڳ���", 150);
	Animal a5 = new Animal("�⸰", 200);

	//�����尪 �׽�Ʈ
	System.out.println(a1.getName());
	System.out.println(a1.getSpeed());
	
	// ����Ʈ���� ���ο� ���� �ֱ�
	a1.setName("������");
	a1.setWeight(40);
	a1.setSpeed(25);
	System.out.println(a1.getName()+"�� �����Դ� "+ a1.getWeight() + "kg �̰�, �ӵ��� "+ a1.getSpeed() + "�̴�.");
	
	System.out.println(a2.getName());
	System.out.println(a3.getName() + "�� �����Դ� " + a3.getWeight() + "kg �Դϴ�.");
	System.out.println(a4.getName());
	System.out.println(a4.getWeight());
	
	// ���� �ӵ� ����
	a2.setSpeed(40);
	System.out.println(a2.getSpeed());
	
	//���� �ӵ� ����
	a2.setSpeedUp(10);
	System.out.println(a2.getSpeed());
	
	// ȣ���� �ӵ� ����
	a3.setSpeed(50);
	System.out.println(a3.getSpeed());
	
	// ȣ���� �ӵ� ����
	a3.setSpeedDown(20);
	System.out.println(a3.getSpeed());
	
	// �ڳ��� �ӵ�
	a4.setSpeed(70);
	System.out.println(a4.getSpeed());
	
	// �ڳ��� �ӵ� 100�̻����� ����
	a4.setSpeedUp(50);
	System.out.println(a4.getSpeed());
	
	
	a4.setSpeedDown(100);
	System.out.println(a4.getSpeed());
	
}
}
