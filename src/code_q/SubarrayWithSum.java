package code_q;

import java.util.ArrayList;

public class SubarrayWithSum {

	public static void main(String args[])
	{
		int arr[] = {1,2,3,7,5};
		System.out.println(subarraySum(arr,12));
	}
	//Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int s) 
    {
        // Your code here
        		   int i=0,j=0,sum1=s; 
			       boolean sumFound = false;
			  while (j<arr.length)
			  {
			    
				  sum1 = sum1 - arr[j];
				  j++;
			    if(sum1 == 0)
			    {
			        sumFound = true;
			      break;
			    }  
			    else if(sum1<0)
			   {
			     while(sum1 <= 0)
			    {
			       if(sum1 == 0)
			     {  
			        j = i; 
			        sum1 = s;
			        break;
			     }  
			       sum1 = sum1 +arr[i];
			        i++;
			    }
			  }
			    
			  }
			  ArrayList<Integer> list = new ArrayList<>();
			  if(!sumFound)
			  {
			      list.add(-1);
			      return list;
			  }
		      i++;
			  list.add(i);list.add(j);
		return list;
    }
}

