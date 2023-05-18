package task1;
public class classB extends classA {	
	@Override
	public void Student(int sId,String sName) {
		System.out.println(sName+ " Id is :" +sId);
	}
	public void Student(int sId,String sName,int sMarks) {
		System.out.println(sName+ " Id is :" +sId);
		System.out.println(sName+ " Marks :" +sMarks);
	}

	public static void main(String[] args) {
		classB obj=new classB();
		
		obj.Student(12345, "Rajesh");
		System.out.println();
		obj.Student(54321, "Gopal", 465);
	}
}
