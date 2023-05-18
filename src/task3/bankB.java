package task3;

public class bankB extends bankA {
	@Override
	public void account(String cName) {
		System.out.println("Customer Name is :"+cName);
	}
	
	public void balance(int withdraw) {
		System.out.println(withdraw +" is Debited from your Account");
	}
	
	public void current(String name,int amt) {
		System.out.println("Hi " +name +" "+amt +" is Credited to Your Account");
	}

	public static void main(String[] args) {
		bankB obj1=new bankB();
		
		obj1.account("Prakash");
		obj1.account("Prakash", 2963101007865l);
		obj1.savings(100000);
		obj1.balance(25000);
		obj1.current("Prakash", 50000);
		
	}
}
