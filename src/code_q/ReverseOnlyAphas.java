package code_q;
import java.util.*;
public class ReverseOnlyAphas {

	public static void main(String args[])
	{  //65-90:A-Z,97-112:a-z  
		/*int i = 's';
		System.out.println(i);*/
		String s="B!FDCEA2";
		StringBuffer sb= new StringBuffer(s);
		int i=0;int j=s.length()-1;
		while(i<=j)
		{   
			int asciiVali = s.charAt(i); 
			int asciiValj = s.charAt(j); 
			if(!(asciiVali>=65 && asciiVali<=90))
			{
				i++;
				continue;
			}
			if(!(asciiValj>=65 && asciiValj<=90))
			{
				j--;
				continue;
			}
			char temp = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j,temp);
			i++;j--;
		
		}
		System.out.println(sb.toString());
	}
}
