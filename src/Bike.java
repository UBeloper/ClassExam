
public class Bike {
	
	String name;
	int speed;
	int price;						// ��� ���� : ��� ���� ���� : �����Ͱ� ���� ����Ǵ� ��
	
	// ����Ʈ ������
	
	public Bike() {
		
	}
	
	public Bike(String bName, int bSpeed, int bPrice) {
		name = bName;
		speed = bSpeed;
		price = bPrice;
	}															// ������ : ������ �ʱ�ȭ �ϴ� ����, Ÿ�� ��� ����, ������ �����͸� �� ó�� ������ �� ���
	
	public String getName() {
		return name; 
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setBike(String bName, int bSpeed, int bPrice) {
		name = bName;
		speed = bSpeed;
		price = bPrice;											// �޼ҵ� : �ν��Ͻ� ������ ����� �Ӽ� ���� �����ϰų� ��ȸ�ϴ� ����
		 
	}
	
	public void setSpeedup(int bSpeed) {
		speed += bSpeed;
	}

}
