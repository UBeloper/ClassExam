import java.util.*;


class Animals {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
		
	}

}

class Human extends Animals{
	public void move() {  //�޼��� �������̵�
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("å�� �д´�.");
	}
}

class Tiger extends Animals{
	public void move() {  //�޼��� �������̵�
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

class Eagle extends Animals{
	public void move() {  //�޼��� �������̵�
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ���ư���.");
	}
}

public class AnimalsTest { //���ϸ�� ������ Ŭ������  public �ʿ�(��1��)
	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest();
		
		Animals[] animalArr = new Animals[10]; //�迭 ��ü ����
		
		for(int i = 0; i < 3; i++) {
			animalArr[i] = new Human();
		}
		
		for(int i = 3; i < 5; i++) {
			animalArr[i] = new Tiger();
		}
		
		for(int i = 5; i < 10; i++) {
			animalArr[i] = new Eagle();
		}
		
		for(int i = 0; i < animalArr.length; i++) {
			animalArr[i].move();
		}
		
//		for (int i = 0; i < 10; i++) {
//			aTest.moveAnimal(animalArr[i]);
//		}
//						
	//----------------------------------------------------------------------
	ArrayList<Animals> aniList = new ArrayList<Animals>();
	aniList.add(new Human()); //��ü �����ϸ鼭 �迭�� �߰�
	aniList.add(new Tiger());
	aniList.add(new Eagle());
		
	for (Animals item : aniList) {
		item.move(); // �������� ���� ������ �޼��� ȣ��ڡڡڡڡڡڡڡ�
		// item.readBook(); Human���� �����Ű�, Animal�� ��ĳ������ �Ǿ��ֱ� ������ �ȉ�. �̷��� �ٿ�ĳ���� �ʿ�.
		
 	}
	// ���� �޼��尡 ȥ��Ǿ��ִ� ��Ȳ���� �� �´� �޼��带 ã�����ؼ� <<< ������ ������ �̷����� ������ ��.
	
	for (int i = 0 ; i < aniList.size(); i++) {
		Animals item /*�������� �ٸ� ��������*/ = aniList.get(i); // get >> "�θ�"��ü�� �޾Ƴ� ��.
		if ( item instanceof Human ) {
			Human h = (Human)item ; /* ���� item�� Ÿ���� �˾Ƴ��� �ſ�. ��� �˾Ƴ��°� �ϸ� instanceof��� ����� Ű���带 �̿��Ѵ�. �޸հ� ������, ����̶�� + �ӽú����� ���� ���� �����ۿ� ��������ϱ� ��ȣ�� ĳ����' */
			h.readBook();
		} else if /*�ƴϸ� Ÿ�̰ſ� ������?*/ (item instanceof Tiger) {
			Tiger t = (Tiger)item;
			t.hunting();
		} else if (item instanceof Eagle) {  /* else��� ������ϴ°� ����. (������ �� ��������� ������ ����) �񱳸� ��Ȯ�ϰ� �������. >>>> �׷��Ƿ� else if */
			Eagle e = (Eagle)item;
			e.flying();
		} else {  /* ������ �ƹ��͵� �������ƶ�..*/
			System.out.println("�� �� ���� �����Դϴ�.");
		}
	}
	}
		
	//----------------------------------------------------
	//move �޼��� ȣ��
	
	public void moveAnimal(Animals animal) {
		animal.move();  //������,������ �ٸ� ���� ����
}	
}