

// "Ŭ����"���� "�������̽�"�� "�����Ѵ�."
// Ŭ���� . ���� . �������̽���
// �ϳ��� �������̽��� ���� Ŭ�������� ������ �����ϴ�.

public class Calculator implements Calc { //�������̽����� �������� �޼ҵ带 �󲮵���� �������ƾ� ������ ��������.
										  // Calc �������̽��� ��� �޼��带 '�ݵ��' �����ؾ� ��. (��ü�ۼ�)
	public int add(int num1, int num2) {
		return num1 + num2; 						  // ����Ÿ���� int�̹Ƿ�. ���� 0�̶�� �� '������ ��ü'�� �����.
	}
	
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if (num2 == 0) {
			return Calc.ERROR;
		} else {
		return num1 / num2;   // '��ȣ'�� �κ��� ������Ѵ�.
		}
	
	}
		
}
