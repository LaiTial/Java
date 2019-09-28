
public class Permutation {
	
	int str[];
	int N = 4;
	int cnt=1;
	MaBaGin maba;
 	boolean bool;
	
 	//순열 구하는 데 필요한 배열 등등에 값을 할당, 초기화하는 생성자 함수. 이곳에서 재귀함수를 처음 호출한다.
	public Permutation()
	{
	      str = new int[N*N];
    	  maba = new MaBaGin(N);
	      
	      for(int i=0; i<str.length; i++)
	      {
	    	  str[i] = i+1;
	      }
	      doPerm(str.length);
	}
	
	//재귀함수. 순열을 구해서 생성해놓은 마방진 클래스에 값을 넘겨준다. 16!만큼 반복
	   private void doPerm(int index)
	   {
		      if(index <= 0) 
		      {		    	  
		    	  this.bool = maba.init(str);
		    	  maba.howMany();
		    	  cnt++;
		    	  			 	
			 	  if(bool != true)
			 		  return;
			 	  
			 	maba.PrintMaBa(cnt);
  		      }
		      else { 
		         doPerm(index-1);
		         int currPos = str.length-index;
		         for (int i = currPos+1; i < str.length; i++) {
		            swap(currPos, i);
		            doPerm(index-1);
		            swap(i, currPos);
		         }
		      }
		   }

	   //두 배열 요소 값들을 바꿔주는 함수다.
		   private void swap(int pos1, int pos2){
		      int t1 = str[pos1];
		      str[pos1] = str[pos2];
		      str[pos2] = t1;
		   }
}
