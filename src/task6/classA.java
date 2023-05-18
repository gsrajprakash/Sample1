package task6;

public class classA  extends absClassA {

	//Class Methods
	public void a1() {
		System.out.println("ClassA - Method1" );
		
	}

	public void a2() {
		System.out.println("ClassA - Method2 ");		
	}
	
	public void a3() {
		System.out.println("ClassA - Method3");
	}

	
	
	
	//Interface Methods
	@Override
	public void ia1() {
		System.out.println("intClassA-Method1");
	}

	@Override
	public void ia2() {
		System.out.println("intClassA-Method2");
	}

	@Override
	public void ia3() {
		System.out.println("intClassA-Method3");
	}
	
	//Abstract Methods
	@Override
	public  void aa1() {
		System.out.println("absClassA -Method1");
	}
	@Override
	public void aa2() {
		System.out.println("absClassA -Method2");
		
	}
	@Override
	public void aa3() {
		System.out.println("absClassA -Method3");
		
	}
}
