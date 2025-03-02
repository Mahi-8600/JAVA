package abstraction;

public interface Demo 
{
public static void main(String[] args) {
//	we can create main method in interface
	System.out.println("Main of interface");
}
//public Demo()
//{
////	Interfaces cannot have constructors
//}
 public default void name() 
{
System.out.println("Hi");	
}
}
