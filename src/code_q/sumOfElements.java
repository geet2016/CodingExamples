package code_q;

public class sumOfElements {

	public static void main(String args[])
	{
		String s = "HelloThere";
		String s1 = reverse(s,"",0);
		System.out.print(s1);
	}
	public static String reverse(String str,String finalstr,int index) {
		if(index == str.length())
		{
			return finalstr;
		}
		finalstr= str.charAt(index)+finalstr;
		return reverse(str,finalstr,index+1);
	}
}
