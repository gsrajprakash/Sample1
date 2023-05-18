package task2;
public class Student2 extends student{	

	public void school(int sId,String sName) {
		System.out.println(sName+ " Id is :" +sId);
	}
	
	public static void main(String[] args) {
		Student2 obj=new Student2();
		obj.school(987665, "Anand");
		System.out.println();
		obj.school(54321, "Gopal", 465);	
	}
}
