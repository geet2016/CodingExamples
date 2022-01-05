package code_q;

import java.util.ArrayList;

public class PermutationString {

	public static ArrayList<Integer> list = new ArrayList<Integer>();
	static void permute(String s , String answer)
	{   
	    if (s.length() == 0)
	    {
	        System.out.print(answer + "  ");
	        if(Integer.parseInt(answer)%5 == 0)
	        {
	          list.add(Integer.parseInt(answer));
	        }
	        return;
	    }
	    
	    for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String left_substr = s.substring(0, i);
	        String right_substr = s.substring(i + 1);
	        String rest = left_substr + right_substr;
	        permute(rest, answer + ch);
	    }
	}

	// Driver code
	public static void main(String args[])
	{
		String s ="12354";//"ABC";
		String answer="";
		permute(s,answer);
	    list.stream().forEach(a -> System.out.println(a+"is divisible by 5"));
	}
}
