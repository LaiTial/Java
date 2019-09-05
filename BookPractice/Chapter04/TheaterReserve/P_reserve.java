package Theater;

public class P_reserve {

	void res(int[] r)
	{
		for(int i=0; i<21; i++)
		{
			System.out.print("-");
		}
			System.out.println("");
			
		
		for(int i=0; i<10; i++)
		{
			System.out.print(i+1 + " ");
		}		
		System.out.println("");
			
		for(int i=0; i<21; i++)
		{
			System.out.print("-");
		}
		System.out.println("");
		
		for(int i=0; i<10; i++)
		{
			System.out.print(r[i] + " ");
		}		
		System.out.println("");
		
	}
}
