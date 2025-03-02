package programs;


public class A02_ReverseString {

	public static void main(String[] args) 
	{
//		*		
//		**
//		***
//		****
		int row=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
				{
				System.out.print("*");		

				}
			System.out.println();

		}
		System.out.println("=====================================");
//		  *		
//		 * *
//		* * *
//	   * * * *
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=====================================");

		for(int i=row;i>=1;i--)
		{
			for(int j=i;j>=1;j--) 
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
