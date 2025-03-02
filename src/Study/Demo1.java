package Study;

public class Demo1 {

	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
//		StaticMethod();
		d.normal();
	}
	public Demo1() 
	{
		System.out.println("P-Constuctor");
	}
public void normal() 
{
	System.out.println("normal");

}

//public static void StaticMethod() 
{
	System.out.println("P-non Static Method");
}
static 
{
	System.out.println("P-Static Method-1");
}

	
}
