package abstraction;

public class B1 extends B{


	public static void main(String[] args) 
	{
//		B a=new B();
//		We can't create object of abstract class 
		B1 a=new B1();
		a.name();
		B.main(args);// we can call main method using class name
	}

	@Override
	public void name() 
	{
	System.out.println("dfghn");	
	}

}
