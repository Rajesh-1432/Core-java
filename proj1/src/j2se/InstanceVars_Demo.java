package j2se;

public class InstanceVars_Demo{

	//  create  instance vars
	int age=20;
	String name="ravi";
	double  sal=19000;
	
	public static void main(String[] args) {
		//  obj creation
		InstanceVars_Demo  obj1=new InstanceVars_Demo();
		System.out.println("obj1  memory  address::"+obj1.hashCode());
		System.out.println("Age::::"+obj1.age);
		System.out.println("Name::::"+obj1.name);
		System.out.println("Salary::::"+obj1.sal);
		
		InstanceVars_Demo  obj2=new InstanceVars_Demo();
		System.out.println("obj2  memory  address::"+obj2.hashCode());
		obj2.age=34;obj2.name="suma";obj2.sal=19000;	
		System.out.println("Age::::"+obj2.age);
		System.out.println("Name::::"+obj2.name);
		System.out.println("Salary::::"+obj2.sal);
		
	}

}
