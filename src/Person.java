
public class Person { // 'Person'�� ���� // ������ >> PersonTest.java

	String name;
	int height;
	int weight;

	// �����ڰ� �Ѱ��� ���� ��� ����Ʈ�����ڰ� ������. >> �׷��� ������ �ȳ��� ��.

	// * ������ �ۼ� ��Ģ
	// �� 'Ŭ���� ��� ����'�ؾ� ��
	// �� ��ȯŸ���� ����(���� ����)

	// �����ε��� ������ >> PersonTest.java ���� >> �����ε��� �����ڰ� ���� ���, ����Ʈ �����ڵ� �����ؾ� ��(������ ��.
	// ������� ����� ������)

	// >> ��������� ����Ʈ ������ �ʿ�
	public Person() {

	}

	public Person(String pName) { // ������ �̸��� �����ϸ鼭, �Ű������� �ٸ�(����, Ÿ��, ���� �� �Ͽ��� �ٸ��⸸ �ϸ� ��)
		name = pName;

	}
	// �����ε��� ������ �ϳ� ��
	public Person(String pName, int pHeight, int pWeight) {
		name = pName; 							// ���� �������, ������ �������� //
		height = pHeight;
		weight = pWeight;

		// �������̱� ������ Ÿ���� ���°�.
	}
		// ���⼭���� �޼��� �̱� ������ Ÿ���� �־�� ��.
	public String getName() {
		return name;
	}	
	
	
	
	// Ű�� �����Ը� ���� ���� >> get �� �� �ִ� �޼��� �߰�
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	

	// ����, Ű, �����Ը� ���� >> set�� �� �ִ� �޼��� �߰�
	
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return; // ���� ��ȯ(���� ����) // ���α׷��ӿ� ���� ������ ��.
	}
	
	
}
