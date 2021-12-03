
public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// ����Ʈ ������
	
	public Customer() {
		initCustomer();
	}
	
	// �����ε��� ������
	public Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// �޼��� (��������! �����ڿ��ٰ���!)
	private void initCustomer() {		// �ܺο��� ���� �Ұ����ϵ���!!!
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {   //calcPrice(�ݾ�) �ϸ� ����ؼ� int�� �־ return�ϰڴ�.
		bonusPoint += price * bonusRatio;
		return price;						// ���ʽ� ����Ʈ ������Ʈ, ������ �״�� ��ȯ
	}
	
	public String showCustomerInfo() {			// ��Ʈ������ �س����� ��Ʈ������ return�� ���� �������.
		return customerName + " : " + customerGrade + " : " + bonusPoint;								
	}
	
 	public String getCustomerName() {
 		return customerName;
 	}
	
}
