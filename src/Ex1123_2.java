
public class Ex1123_2 {

	public static void main(String[] args) {
		// �ν��Ͻ� �����ؾ� Ŭ���� ��� ����
		// ���� : Ŭ������ ������ = new ������();    // ���� : ������ -> Ŭ������
		// ����Ʈ �����ڴ� Ŭ������� �����ϸ� �Ű����� ����
		
		Ex1123_1 cal1 = new Ex1123_1(); // ����Ʈ �����ڷ� �ν��Ͻ� ����(��ü ����)
	
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		
		System.out.println(cal1.add(10,20));
		
		cal1.add(30, 40);
		System.out.println(cal1.add(30, 40));
		
		int test = cal1.add(1, 2); // ** ����� test�� ��ȯ!!
		System.out.println(test);
		
		cal1.product(20, 5);
		System.out.println(cal1.product(20, 5)); 	
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);				// ������ ������ ����
		System.out.println(cal1.result);
			
					
	
		System.out.println(cal1.add());
		
		
		// �ι�° ��ü!!!
		
		Ex1123_1 cal2 = new Ex1123_1(3,5);
		System.out.println(cal2.add());
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.divide());
		
		//ó������ �żҵ嵵 Ȱ�� ����!
		System.out.println(cal2.add(2,3));
		
		System.out.println(cal2.num1);
		System.out.println(cal2.num2);			// ��ü�� ����� ����
		System.out.println(cal2.result);		// ������ ����
		
		cal2.setNum1(50);
		System.out.println(cal2.num1);
				
		
		
		// ����° ��ü!!1
		
		Ex1123_1 cal3 = new Ex1123_1(10,5);
		// 10 + 5 = 15
		System.out.println("10 + 5 = " + cal3.add());											// X
		System.out.println(cal3.num1 +" + "+ cal3.num2 +" = "+ cal3.add());						// X ���ȋ���
		System.out.println(cal3.getNum1() +" + "+ cal3.getNum2() +" = "+ cal3.add());  			// ���߿� ���ȶ����� �Ϲ������� get�� set�� ���°�!!!!
		
		
		
		
		
		// �׹�° ��ü ���� �� �׽�Ʈ
		
		// �ڡڡڡڡڡڡ� ����Ʈ �����ڷ� ���� �� �Ű�����(9,10) �߰��ϰ� ���� ��� �׽�Ʈ �ڡڡڡڡڡڡڡڡ�
		
		Ex1123_1 cal4 = new Ex1123_1();
		
		cal4.setNum1(9);
		cal4.setNum2(10);							// set�� ������ ������°� ���� (n1, n2)�� ���輺�� ����.
		
		System.out.println(cal4.product());
		System.out.println(cal4.getNum1() +" * "+ cal4.getNum2() +" = "+ cal4.product());
		
		// ************ " 'set'�� �ڿ� 'get'�Ѵ�!!!!!!!!!!!! " ********************
		
	}
}
