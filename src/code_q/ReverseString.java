package code_q;

public class ReverseString {
public static void main(String args[])
{
  String s ="Hello World";
  
  System.out.print(reverse(s,s.length()));
  // System.out.print(s.length()+"  :"+s.charAt(s.length()-1));
}
 public static String  reverse(String s,int len)
 {
	 if(len == 0)
	 {  
		  return s;
	 }
     return s.charAt(len-1)+reverse(s.substring(0,len-1),len-1);

 }
}
