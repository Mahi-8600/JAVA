package Study;

public class Demo4  {

	public static void main(String[] args) 
	{
		String a="I*am*working*at*Opkey";
		
		String b[]=a.split("*");
		
		String rev="";
		
		for(int i=b.length-1;i>=0;i--)
		{
			if(b[i].equalsIgnoreCase("Opkey")) 
			{
				rev=rev+b[i];
			}
			else
			{
				for(int j=b[i].length()-1;j>=0;j--)
				{
					char c=b[i].charAt(j);
					rev=rev+c;
				}	
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
	
}
