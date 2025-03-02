package programs;


public class A01_StarProgram {

	public static void main(String[] args) 
	{
		String A="Mahesh";
		
		String rev="";
		for(int i=A.length()-1;i>=0;i--)
		{
			char c=A.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
		System.out.println("====================================");
		int n=1234;
		String S=String.valueOf(n);
		System.out.println(S+5);
		
	}

}
