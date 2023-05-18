package task6;

public class classB extends absClassB{

	//Class Methods
	public void b1() {
		System.out.println("Class B - Method1");
	}
	
	public void b2() {
		System.out.println("Class B - Method2" );
	}
	
	public void b3() {
		System.out.println("Class B -Method3");
	}

	
	
	
	//Interface Methods
	@Override
	public void ib1() {
		System.out.println("intClassB-Method1");
	}

	@Override
	public void ib2() {
		System.out.println("intClassB-Method2");
	}

	@Override
	public void ib3() {
		System.out.println("intClassB-Method3");
	}
	
	
	//Abstract Methods
	@Override
	public void ab1() {
		System.out.println("absClassB -Method1");
	}
	@Override
	public void ab2() {
		System.out.println("absClassB -Method2");
		
	}
	@Override
	public void ab3() {
		System.out.println("absClassB -Method3");
		
	}

	
	
}
