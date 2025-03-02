package array_study;

public class Sample1 {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=15;
		a[2]=20;
		a[3]=25;
		a[4]=30;
		
		for(int i=0;i<=a.length-1;i++) 
		{
		System.out.println(a[i]);
		}
		System.out.println("===================");
		for(int s:a) 
		{
		System.out.println(s);
		}
		System.out.println("===================");

//		int b[][]=new int[2][2];
//		b[0][0]=2;
//		b[0][1]=4;
//		b[1][0]=6;
//		b[1][1]=8;
		int b[][]= {{1,2,3},{4,5,6},{7,8,9},{0,11,12}};
		System.out.println("length of row--->"+b.length);
		System.out.println("length of column--->"+b[0].length);
		
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[0].length-1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}


		
	}

}
