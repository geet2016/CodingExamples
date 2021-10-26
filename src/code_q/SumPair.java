package code_q;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumPair {

	/*Problem Statement
	You are given an integer array 'ARR' of size 'N' and an integer 'S'. Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.
	Note:
	Each pair should be sorted i.e the first value should be less than or equals to the second value. 

	Return the list of pairs sorted in non-decreasing order of their first value. In case if two pairs have the same first value, the pair with a smaller second value should come first.
	Input Format:
	The first line of input contains two space-separated integers 'N' and 'S', denoting the size of the input array and the value of 'S'.

	The second and last line of input contains 'N' space-separated integers, denoting the elements of the input array: ARR[i] where 0 <= i < 'N'.
	Output Format:
	Print 'C' lines, each line contains one pair i.e two space-separated integers, where 'C' denotes the count of pairs having sum equals to given value 'S'.
	Note:
	You are not required to print the output, it has already been taken care of. Just implement the function.
	Constraints:
	1 <= N <= 10^3
	-10^5 <= ARR[i] <= 10^5
	-2 * 10^5 <= S <= 2 * 10^5

	Time Limit: 1 sec
	Sample Input 1:
	5 5
	1 2 3 4 5
	Sample Output 1:
	1 4
	2 3
	Explaination For Sample Output 1:
	Here, 1 + 4 = 5
	      2 + 3 = 5
	Hence the output will be, (1,4) , (2,3).
	Sample Input 2:
	5 0
	2 -3 3 3 -2
	Sample Output 2:
	-3 3
	-3 3
	-2 2*/
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};
		int[] brr ={2,-3, 3, 3, -2};
	    int[] crr = {2 ,-6 ,2 ,5 ,2 };
		int[][] a = pairSum(crr,4);
		
		  for(int i=0;i<a.length;i++)
		   {
			   for(int j=0;j<2;j++)
			   {
				   System.out.print(a[i][j]);
			   }
			   System.out.println();
		   }
	}
	   public static int[][] pairSum(int[] arr, int s) {
	        // Write your code here.
		   int k=0;int l=0;
		  
		 //  Map<Integer,Integer> map = new TreeMap<>();
		  //Map<Integer,List<Integer>> map = new TreeMap<>();
		   List<Pairs> list = new ArrayList<>();
		   for(int i=0;i<arr.length;i++)
		   {
			   for(int j=0;j<arr.length;j++)
			   {   
				   if((arr[i]+arr[j] == s ) && (arr[i]<=arr[j]))
				   {  
					  /*if(!map.containsKey(arr[i]))
					  { 
						 list.add(arr[i]);
						 map.put(arr[j],list);
					  }*/
					 /*  a[k][l]=arr[i];
					   a[k][l+1]=arr[j];
					   k++;*/
					   Pairs pair = new Pairs();
					   pair.setAi(arr[i]);
					   pair.setSum_ai(arr[j]);
					   list.add(pair);
				   }
			   }
		   }
		  /* int[][] a =
			        map.entrySet().stream()
			                .map(e -> new int[]{e.getKey(), e.getValue()})
			                .toArray(int[][]::new);
	*/
		   int[][] a = new int[list.size()][2];
		   for(int i=0;i<a.length;i++)
		   {
			   
				   a[i][0] = list.get(i).getAi();
				   a[i][1] = list.get(i).getSum_ai();  
		   }
		   
		   return a;
	    }
}

class Pairs{
	public int ai ;
	public int sum_ai;
	public int getAi() {
		return ai;
	}
	public void setAi(int ai) {
		this.ai = ai;
	}
	public int getSum_ai() {
		return sum_ai;
	}
	public void setSum_ai(int sum_ai) {
		this.sum_ai = sum_ai;
	}
	
}
