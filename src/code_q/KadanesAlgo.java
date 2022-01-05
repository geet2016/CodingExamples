/**
 * 
 */
package code_q;

/**
 * @author GCHOUDHARI
 *
 */
public class KadanesAlgo {

	public static void main(String args[])
	{
	  int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};/*{-1,-2,-3,-4};*/ //{1,2,3,-2,5};
	  System.out.println(kdAlgo(arr));
	 
	}
	public static int kdAlgo(int[] arr)
	{
		int maxSum=0;int maxSumsofar=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		     maxSum = maxSum +arr[i];
		 
		     if(maxSum<0 && maxSum < maxSumsofar)
			 {
			  maxSum = maxSumsofar;
			 }
		
			 if(maxSum>maxSumsofar)
			 {
				 maxSumsofar = maxSum;
			 }
		 
		}
       return maxSum;
	}
}
