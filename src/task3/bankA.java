package task3;

public class bankA {

	public void account(String cName) {
		System.out.println("Customer Name is :"+cName);
	}
	
	public void account(String cName, long AccNo) {
		System.out.println("Customer Name is :"+cName);
		System.out.println("Customer Acc/No is :"+AccNo);
	}
	
	public void savings(int bal) {
		System.out.println("Your Account Balance is "+bal);
		
	}
}
