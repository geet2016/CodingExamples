package code_q;

public class SumZeroOneEqual {

	public static void main(String args[])
	{
		int a[]={0, 0, 1, 1, 0};//{1, 1, 1, 1};//{1, 0, 1, 1, 1, 0, 0};
		int index_i=0,index_j=0;
		int MaxsumO=0;
		for(int i=0;i<a.length;i++)
		{
			int sumO=0;int sumZ=0;int j=i;
			while(j<a.length)
			{
				if(a[j] == 1)
				{
					sumO= sumO+1;
				}
				else if(a[j] == 0){
					sumZ=sumZ+1;
				}
				j++;
			}
			System.out.print(sumO+","+sumZ);
			System.out.println();
			if(sumO == sumZ)
			{
				if(sumO > MaxsumO)
				{
					MaxsumO = sumO;
				   	index_i = i;
				   	index_j = j-1;
				}
			}
		}
		
		System.out.println("index_i:"+index_i);
		System.out.println("index_j:"+index_j);
	}
}
