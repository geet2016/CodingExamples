package code_q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class MissingNumber {

	public static void main(String args[])
	{
	   int[] arr = {1,2,4,5,6,3,8};
	   int n=8;
       int sum = (n*(n+1))/2;
 
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i:arr)
       {
    	   list.add(Integer.valueOf(i)); //result[i] = IntegerArray[i].intValue();
       }
       Optional<Integer> list2 = list.stream().reduce((v,c)->{
    	   return v+c;
       });
       System.out.println(sum-list2.get());
	}
}
