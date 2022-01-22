package code_q;
import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicates {

	public static void main(String args[])
	{
		int [] a = {1,2,5,4,6,42,2,4};
		TreeSet<Integer> set = new TreeSet<>();
		for(int i:a)
		{
			set.add(Integer.valueOf(i));
		}
		System.out.println(set);
	}
}
