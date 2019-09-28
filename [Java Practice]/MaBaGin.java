
public class MaBaGin {
	
	int[] sr, sc;
 	int[][] ms;
 	int count = 0;
	int N, Maba;
	int howMany = 0, howPrint = 0;
	
	public MaBaGin(int N) //�� Ŭ������ �������Լ�. �������� �ʿ��� �迭 ���� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
	{
		sr=new int[N];
		sc=new int[N+2];
		ms=new int[N][N];
		
		this.N = N;
		Maba= ((1+(N*N))*N)/2;
	}
	
	   public boolean init(int[] str)
	   {
		   int cc = 0;
		   sc[0] = 0;
		   sc[N+1] = 0;
		   
		/*2���� �迭 ms�� 00��°���� ������� �ʱ�ȭ�� ���ÿ� ���� ���� ���Ѵ�. �� �࿡ ���
		 ���� ���� ���ÿ� ���� �˻縦 �Ͽ� ����ġ�� false�� return�Ѵ�.*/

		   for(int i=0; i<N; i++) {  
			   
			   sr[i] = 0;
			   
			  for(int j=0; j<N; j++) {
			 		ms[i][j] = str[cc++];
			 		sr[i] += ms[i][j];
			 		
			 	}
			  if(checkNum(i) != true)
					return false;
	   }
		   
			/*���� �հ� �밢�� ������ ���� ���ϴ� for��.
			 ���� �� �ϳ��� ���� ������ ���� �˻縦 �Ͽ� ����ġ�� false return.*/
		   
		   for(int i=0; i<N; i++) {
			   
			   sc[i+1] = 0;
			   
			  for(int j=0; j<N; j++) 
			  {
				  sc[i+1] += ms[j][i];
			 }
			  if(checkNumTwo(i+1) != true)
					return false;
			  
			 sc[0] += ms[i][N-i-1];
			 sc[N+1] += ms[i][i];
	   }
		   
		   /*���� �밢���� ���� �˻��Ѵ�. ����ġ�� false�� return �Ѵ�. */
		   
		   	if(checkNum() != true)
		 		return false;
		   	
		/*������� �� �Լ��� ���ᰡ ���� �ʾҴٴ� ���� ������� �˻��� ��� ���ǹ��� �����Ѵٴ� ���̹Ƿ� ���������� true�� return�Ѵ�.*/
		   	
			return true;
	   }
	   
	   //�밢���� ���� MagicNumber�� ��ġ�ϴ� �� �˻��ϴ� �Լ�. �� �밢���� ���� ��� MagicNumber�� ��ġ�ϸ� true return�ϰ� �ƴ� �� false return.
	   public boolean checkNum()
	   {
		   if((sc[0] != Maba) || (sc[N+1] != Maba)) 
			   return false;
		   
		   else return true;
	   }
	   
	   
	 //�� ���� ���� MagicNumber�� ��ġ�ϴ� �� �˻��ϴ� �Լ�. ��ġ�ϸ� true return�ϰ� �ƴ� �� false return.
	   public boolean checkNum(int i) 
	   {
		   if(sr[i] != Maba)
	  		{
			   	return false;
	  		}
		   return true;
	   }
	   
	   //�� ���� ���� MagicNumber�� ��ġ�ϴ� �� �˻��ϴ� �Լ�. ��ġ�ϸ� true return�ϰ� �ƴ� �� false return.
	   public boolean checkNumTwo(int i)
	   {
		   
		   if(sc[i] != Maba)
	  		{
			   	return false;
	  		}
		   return true;
	   }
	   
	   //������ ����ϴ� �Լ�.
	   public void PrintMaBa(int cn)
	   {
		   System.out.println();
		   
		   if(count == 0)
		   {
			  System.out.println(" �й� : 2018301011  �̸�: �����");
			   System.out.println("N=" + N + ", Magic Number=" + sc[0]);
		   }
			   
		   
		   count++;
		   
		 	System.out.println("Success: " + count + ", R=" + cn);
		 	for(int i=0; i<N; i++) {
		 	  System.out.printf("%4s", " ");
		 	  for(int j=0; j<N; j++) {
		 	        System.out.printf("%4d",ms[i][j]);
		 	     }
		 	     System.out.printf(" |%4d\n", sr[i]);
		 	   }
		 	System.out.println("------------------------");
		 	for (int i=0; i<N+1; i++) System.out.printf("%4d", sc[i]);
		 	System.out.printf(" |%4d\n\n", sc[N+1]);
		}
	   
	   //���� ���α׷� ���° ���� ������ ������ִ� �Լ�
	   public void howMany()
	   {
		 	howMany++;
		 	if(howMany%1000000000 == 0)
		 	{	
		 		howMany = 0;
		 		howPrint++;
		 		System.out.print(howPrint + " ");
		 		
		 		if(howPrint%20 == 0)
		 			System.out.println("");
		 	}
	   }
}
