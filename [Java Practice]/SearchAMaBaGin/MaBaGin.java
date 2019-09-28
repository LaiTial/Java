
public class MaBaGin {
	
	int[] sr, sc;
 	int[][] ms;
 	int count = 0;
	int N, Maba;
	int howMany = 0, howPrint = 0;
	
	public MaBaGin(int N) //이 클래스의 생성자함수. 마방진에 필요한 배열 등을 생성하고 변수를 초기화한다.
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
		   
		/*2차원 배열 ms의 00번째부터 순서대로 초기화와 동시에 행의 합을 구한다. 한 행에 모두
		 값이 들어감과 동시에 조건 검사를 하여 불일치시 false를 return한다.*/

		   for(int i=0; i<N; i++) {  
			   
			   sr[i] = 0;
			   
			  for(int j=0; j<N; j++) {
			 		ms[i][j] = str[cc++];
			 		sr[i] += ms[i][j];
			 		
			 	}
			  if(checkNum(i) != true)
					return false;
	   }
		   
			/*열의 합과 대각선 각각의 합을 구하는 for문.
			 열의 합 하나를 구할 때마다 조건 검사를 하여 불일치시 false return.*/
		   
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
		   
		   /*구한 대각선의 합을 검사한다. 불일치시 false를 return 한다. */
		   
		   	if(checkNum() != true)
		 		return false;
		   	
		/*여기까지 이 함수가 종료가 되지 않았다는 것은 현재까지 검사한 모든 조건문이 일차한다는 것이므로 마지막으로 true를 return한다.*/
		   	
			return true;
	   }
	   
	   //대각선의 합이 MagicNumber와 일치하는 지 검사하는 함수. 두 대각선의 합이 모두 MagicNumber와 일치하면 true return하고 아닐 시 false return.
	   public boolean checkNum()
	   {
		   if((sc[0] != Maba) || (sc[N+1] != Maba)) 
			   return false;
		   
		   else return true;
	   }
	   
	   
	 //각 행의 합이 MagicNumber에 일치하는 지 검사하는 함수. 일치하면 true return하고 아닐 시 false return.
	   public boolean checkNum(int i) 
	   {
		   if(sr[i] != Maba)
	  		{
			   	return false;
	  		}
		   return true;
	   }
	   
	   //각 열의 합이 MagicNumber에 일치하는 지 검사하는 함수. 일치하면 true return하고 아닐 시 false return.
	   public boolean checkNumTwo(int i)
	   {
		   
		   if(sc[i] != Maba)
	  		{
			   	return false;
	  		}
		   return true;
	   }
	   
	   //마방진 출력하는 함수.
	   public void PrintMaBa(int cn)
	   {
		   System.out.println();
		   
		   if(count == 0)
		   {
			  System.out.println(" 학번 : 2018301011  이름: 김소희");
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
	   
	   //현재 프로그램 몇번째 돌린 건지를 출력해주는 함수
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
