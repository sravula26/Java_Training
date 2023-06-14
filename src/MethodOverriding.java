package first;




class Test {	
	public void method()
	{
		System.out.println("Method 1");
	}
}
public class MethodOverriding extends Test {	
	public void method()
	{
		System.out.println("Method 2");
	}
	public static void main(String args[])
	{
		//calling parent method
		//Test test = new Test();
		//Calling child method
		Test test = new MethodOverriding();
		test.method();
	}
}