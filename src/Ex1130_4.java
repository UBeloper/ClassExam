
public class Ex1130_4 {
	public static void main(String[] args) {
		
		
		// ������ �迭
				
//		int arr[][] = new int[2][3];  // 2�� 3��
		
		// ������ ���ÿ� �ʱ�ȭ ���� ���	
		int arr[][] = { {1,2,3},{4,5,6} }; // 2�� 3��
		
		
		// �� �� �� ���� ��� + �࿭ ���η� ����ϱ�
		
		for(int i = 0 ; i < arr.length ; i++) { // �� // arr.length >> �� ���ڸ� �˾Ƴ�
			for(int j = 0; j < arr[i].length; j++) { //�� // arr[i].length >> �� ���ڸ� �˾Ƴ�
				
				System.out.print(arr[i][j] + " ");		// ������ ����غ��� + �پ�����ϱ� ����
			}
			
			System.out.println();						// ������ ����غ��� ����ٰ� ��ĭ����
		}
		 
		System.out.println(arr[0][1]);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
