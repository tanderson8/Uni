
public class InterfaceDemo {

	public static void main(String [] args)
	{
		MyClass m = new  MyClass();
		m.someMethod();
		System.out.println("The value of the constant " + MyInterface.myInt);
	}
}


class MyClass implements MyInterface
{
	@Override public void someMethod()
	{
		System.out.println("This is the method you can change and modify as you need.");
	}
}

interface MyInterface
{
	int myInt = 5;
	void someMethod(); 
}