
public class Permutation {
	
	int str[];
	int N = 4;
	int cnt=1;
	MaBaGin maba;
 	boolean bool;
	
 	//���� ���ϴ� �� �ʿ��� �迭 �� ���� �Ҵ�, �ʱ�ȭ�ϴ� ������ �Լ�. �̰����� ����Լ��� ó�� ȣ���Ѵ�.
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
	
	//����Լ�. ������ ���ؼ� �����س��� ������ Ŭ������ ���� �Ѱ��ش�. 16!��ŭ �ݺ�
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

	   //�� �迭 ��� ������ �ٲ��ִ� �Լ���.
		   private void swap(int pos1, int pos2){
		      int t1 = str[pos1];
		      str[pos1] = str[pos2];
		      str[pos2] = t1;
		   }
}
