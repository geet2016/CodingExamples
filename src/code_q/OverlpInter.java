package code_q;

public class OverlpInter {

	public static void main(String arg[])
	{
		long[] st={1,4};//{1,2,3};//{1 ,100 ,200 ,150};//{1,2,3};//{1};
			//{1,2,2};/*{1,3};*/ /*{1,2,3};*/ /*{2,1,3};*/ /*{1,2,3,4,5};*/ 
		long[] et={2,5};//{6,7,8};//{100 ,200, 300, 400};//{2,3,4};//{2};
	//{2,3,4};/*{5,4};*/ /*{2,3,4};*/ /*{3,2,4};*/ /*{9,3,4,5,6};*/ 
		System.out.print(checkOverlappingIntervals(st,et));
		
	}
	
	
	 public static boolean checkOverlappingIntervals 
     (long[] startTime, long[] endTime) {
   boolean flag = false;
		if(startTime.length>1){
		for(int i=0;i<startTime.length;i++)
		{
			for(int j=0;j<startTime.length;j++)
			{
				if(startTime[i]>startTime[j] && startTime[i]!=endTime[j] && startTime[i]<endTime[j])
				{
					System.out.println(startTime[i]+">"+startTime[j]);
					flag= true;
					break;
				}
				if(endTime[i]<endTime[j] && endTime[i]!=startTime[j] && endTime[i]>startTime[j])
				{ 
					System.out.println(endTime[i]+"<"+endTime[j]);
					flag= true;
					break;
				}
			}
		}}
		
		return flag;
 }
}
