package task6;

public class connectionClass {
	private classA i1;
	private classB i2;
	private classC i3;
	
	
	public classA getA1() {
		return (i1==null)?i1=new classA():i1;
	}
	
	public classB getA2() {
		return (i2==null)?i2=new classB():i2;
	}
	
	public classC getA3() {
		return (i3==null)?i3=new classC():i3;
	}
	
}
