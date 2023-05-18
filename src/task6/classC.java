package task6;

public class classC extends absClassC{
	
	//Class Methods
	public void c1() {
		System.out.println("Class C -Method1");
		
	}
	
	public void c2() {
		System.out.println("Class C -Method2");
		
	}
	
	public void c3() {
		System.out.println("Class C -Method3");
	}

	
	
	
	//Interface Methods
	@Override
	public void ic1() {
		System.out.println("intClassC-Method1");
	}

	@Override
	public void ic2() {
		System.out.println("intClassC-Method2");
	}

	@Override
	public void ic3() {
		System.out.println("intClassC-Method3");
	}
	
	
	//Abstract Methods
	public void ac1() {
		System.out.println("absClassC -Method1");
	}
	
	public void ac2() {
		System.out.println("absClassC -Method2");
		
	}
	
	public void ac3() {
		System.out.println("absClassC -Method3");
		
	}


}
