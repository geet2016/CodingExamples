package code_q;
import java.util.*;
import java.util.stream.Collectors;
public class firstNonRepeatingChar {

	public static void main(String args[])
	{
		String str ="GeeksforGeeks";
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)+""))
			{
				map.put(str.charAt(i)+"",map.get(str.charAt(i)+"")+1);
			}
			else {
				map.put(str.charAt(i)+"",1);
			}
		}
		System.out.println(map);
	/*	List<Integer> list2 = map.values().stream().collect(Collectors.toList());
		Optional<Integer> firstNonRepeating = list2.stream().filter(s -> s==1).findFirst();
		if(firstNonRepeating.isPresent()) {
			System.out.println(firstNonRepeating.get());
		}*/
		String firstNonRepeating="";
		for(Map.Entry<String,Integer> m : map.entrySet())
		{
			if(m.getValue() == 1)
			{
				firstNonRepeating = m.getKey();
				break;
			}
		}
		
		System.out.println(firstNonRepeating);
	}
}

