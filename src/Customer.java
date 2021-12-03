
public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 생성자
	
	public Customer() {
		initCustomer();
	}
	
	// 오버로딩된 생성자
	public Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// 메서드 (공유목적! 생성자에다가도!)
	private void initCustomer() {		// 외부에서 접근 불가능하도록!!!
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {   //calcPrice(금액) 하면 계산해서 int로 넣어서 return하겠다.
		bonusPoint += price * bonusRatio;
		return price;						// 보너스 포인트 업데이트, 가격은 그대로 반환
	}
	
	public String showCustomerInfo() {			// 스트링으로 해놨으면 스트링으로 return할 값을 적어야함.
		return customerName + " : " + customerGrade + " : " + bonusPoint;								
	}
	
 	public String getCustomerName() {
 		return customerName;
 	}
	
}
