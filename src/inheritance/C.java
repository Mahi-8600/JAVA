package inheritance;

public class C extends B{

	public static void main(String[] args) 
	{

		A a=new A();
		B b=new C();
		C c=new C();
//		a.Demo1();
//		b.Demo1();
//		b.Demo2();
	
	}
	public void Demo3() 
	{
		System.out.println("Method of C");
	}

}
