
public class Ex1126_2 {

	public static void main(String[] args) {
		// �ƽ�Ű�ڵ� �������
		char[] alpha = new char[26];
		char ch = '0'; 						
									 // ����� ���۹���
									 // �밡�� ��� �迭 alpha[0] = 'A', alpha[1] = 'B' ... 'H' ... 'Z'
		
		
		
//		ch++; // �׳� �� ��ü�� ���ڰ��� ��鼺�� ��±���. 
		
//		System.out.println(ch);
		
		for(int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;					// ch ���� alpha��� �迭�� i��°�� �����Ѵ�. ó�� �ʱ�ȭ�� �� A�� 0���� �����ϱ� �����ؼ� Z���� 25���� �����ϴ°� ����.
		}

//		System.out.println(alpha[0]);
//		System.out.println(alpha[25]);
//		System.out.println((int)alpha[4]);
	
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]+":"+(int)alpha[i]);
		}
		
		
		
		
	}

}
