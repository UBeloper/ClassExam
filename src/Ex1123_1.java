
public class Ex1123_1 {

	// ��Ģ�����
	int result; // ����������� �Ӽ�
	int num1; // ��꿡 ���Ǵ� ���� �Ӽ�
	int num2; // ��꿡 ���Ǵ� ������ �Ӽ�

	// ������!! (**�ϱ� : Ŭ������� ����, ��ȯŸ�� ����(�׷��Ƿ� ���ϵ� ����/���״�� '����'�� ����, �������� �޼���� ����)

	// ����Ʈ ������
	public Ex1123_1() {
	
	
	}

	// �Ű������� �ִ� ������
	public Ex1123_1(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	
	
	// *****������ ���� 
	// " �� �� �� �ϰ� �׳� ����!"�ϴ� ���� void
	public void setNum1(int n1) {
		num1 = n1;
		
	}

	public void setNum2(int n2) {
		num2 = n2;
	}
	

	
	// *****������ �б� 
	// �о���ϹǷ� Ÿ�Ը������ �� int
	public int getNum1() {			//�μ��� ����. ȣ���ϸ� �ٷ� �о���� �ϱ� ����.
		return num1;				// return
	}
	
	public int getNum2() {				//�μ��� ����. ȣ���ϸ� �ٷ� �о���� �ϱ� ����.
		return num2;
		
	}
	
	
	

	// �޼ҵ� : 'ȣ��'�� �ϱ����� ��Ī 'add'�� ����

	public int add() {
		result = num1 + num2;					// ���� �޾ƿ��� �ʾƵ� ����Ǿ� �ֱ� ������ �̷��� �� �� ����.
		return result;
		
	}
	

	public int subtract() {
		result = num1 - num2;					
		return result;
		
	}

	public int product() {
		result = num1 * num2;					
		return result;
		
	}

	public int divide() {
		result = num1 / num2;					
		return result;
		
	}

	
	public int add(int n1, int n2) { // �ϴ����� ���� ���������� �μ⸸�Ѵ� > void // ������ ��ȯ�� �ްԵǱ⿡ ��ȯŸ�� ������ 'int'�� ��.
		num1 = n1;
		num2 = n2;

		// result = n1 + n2; //�̰͵� ����
		result = num1 + num2; // �������� // ������ ��ȯ�� �ްԵǱ⿡ ��ȯŸ�� ������ 'int'�� ��. // **���� : public ��ȯŸ�� �޼���� (�Ű�����
						     		// ����Ʈ)
		return result; // **********�׳� �ܿ���
						// **** ȣ��� return�� ��, void�� �ٲٸ� ������ �ȳ�

	}

	// ���� �޼���

	public int subtract(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = num1 - num2;
		return result;
	}

	// ���� �޼���
	public int product(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = num1 * num2;
		return result;
	}

	// ������ �ż���
	public int divide(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = num1 / num2;
		return result;
	}

}
