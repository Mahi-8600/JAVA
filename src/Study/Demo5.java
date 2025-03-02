package Study;

import java.util.HashMap;
import java.util.Iterator;

public class Demo5  {

	public static void main(String[] args) 
	{
//		String a="Mah54eshsdgsh";
//		int B = a.lastIndexOf('h');
//		System.out.println(B);
//		System.out.println(a.length());
//		System.out.println(a.charAt(6));
//		System.out.println(a.replace("5","9"));
//		System.out.println(50+100+200);
//		int a1='j';
//		char x=106;
//		System.out.println(x);
		
//		String a = "mahesh";
//		String b = "shelke";
//		a=a+b;
//		b=a.substring(0,6);
//		System.out.println(a);
//		System.out.println(b);
//		a=a.replace(b, "");
//		System.out.println(a);
		
		String a="ahdshaasga";
		HashMap<Character, Integer> HM=new HashMap<>();
		char ch[]=a.toCharArray();
		for(char c:ch)
		{
			if(HM.containsKey(c))
			{
				int x=HM.get(c);
				HM.put(c, x+1);
			}
			else 
			{	
				HM.put(c,1);
			}
			
		}
		System.out.println(HM);
		Iterator<Integer> it=HM.values().iterator();
		while (it.hasNext()) {
            System.out.println(it.next());
        }

		
	}
	
}
