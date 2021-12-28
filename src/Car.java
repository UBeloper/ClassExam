
public class Car {
	
	String name; //������� : ��� ���� ���� : �����Ͱ� ���� ����Ǵ� ��
	int speed;
	
	public Car() {
		name = "�ڵ���";
		speed = 150;
		
	}
	
	public Car(String n) {		// ������ : ������ �ʱ�ȭ �ϴ� ����, Ÿ�� ��� ����, ������ �����͸� �� ó�� ������ �� ���
		name = n;
	}
	
	public Car(int s) {
		speed = s;
	}
	
	public Car(String cName, int cSpeed) {
		name = cName;    // �Ű�����
		speed = cSpeed;
	}
	
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	
	
	public void setCar(String cName, int cSpeed) {		// �޼ҵ� : �ν��Ͻ� ������ ����� �Ӽ� ���� �����ϰų� ��ȸ�ϴ� ����
		name = cName;
		speed = cSpeed;
		
	}
	
	public void setSpeedup(int cSpeed) {
		speed += cSpeed;
	}
	
	public void setSpeeddown(int cSpeed) {
		speed -= cSpeed;
	}
	
}