package abstraction;

public abstract class B {


	public static void main(String[] args) {
//		we can create main method in interface
		System.out.println("B main");
	}
	public B() //We can create constructor abstract class
	//constructor can call when object of sub class is created
	{
		System.out.println("B constructor");
	}
	public abstract void name();
	
	final public void name1() 
	{
		
	}

}
