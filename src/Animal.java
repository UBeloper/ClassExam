
public class Animal {
	
	String name;
	int weight;											// �������
	int speed;
	
	// ������
	public Animal() {									// ����Ʈ = �μ��� ����.
		name = "����";
		weight = 30;
		speed = 0;
		
	}
	
	public Animal(String aName) {
		name = aName;
		weight = 30;										// �ٸ� ���� ����Ʈ ������Ѵ�!!!!
		speed = 0;
	}
	
	public Animal(String aName, int aWeight) {
		name = aName;
		weight = aWeight; 								    // �̸� ü�� �� �ٸ� ���� ����Ʈ �� ����Ѵ�!!!
		speed = 0;
	}
		
	// �ż��� ����

	// set
	public void setName(String aName) {
		name = aName;
	}

	public void setWeight(int aWeight) {
		weight = aWeight;
	}
	
	public void setSpeed(int aSpeed) {
		speed = aSpeed;
	}

	// get
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}
	
	public int getSpeed() {
		return speed;									// get�̳� set�� �ƹ����� ���ٺ����� �ʴ°� ����.
														// ��¡������ �ǹ̰� ������.
	}
	

	// �޸��� �ӵ� ����
	
	// �ڡڡڡڡڡڡڡڡ� speed�� �������� ���� '����' �����ϴ� ���
	public void setSpeedUp(/*�ƹ��͵� �ȳ���*/) {     //Ư�� ���� �ִ°� �ƴϴϱ� �ƹ��͵� �ȳְ� ���ڸ� ���� �� �ִ°���.
		if(speed + 10 > 100) {
		System.out.println("�ӵ��ʰ�");}
		else {
			speed += 10;
		}
		
	}
	
	
	public void setSpeedUp(int aSpeed) {
		if(speed + aSpeed > 100) {						// speed > 100�� �ȵǴ� ������, '���� ���� speed��' ����� ���� 100�� �ʰ��Ǿ�� speed=100 �� �Ǵ� ��!!! 
			System.out.println("�ӵ��ʰ�");								// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		}else {
			speed += aSpeed;
		}
		
	}
	
	public void setSpeedDown(int aSpeed) {
		if(speed-aSpeed < 0) {
			System.out.println("�ӵ��̴�");
		}else {											// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
			speed -= aSpeed;
		}
		
	}
	
	
	
	
}
