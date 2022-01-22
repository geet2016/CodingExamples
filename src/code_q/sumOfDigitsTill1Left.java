package code_q;

public class sumOfDigitsTill1Left {

	public static void main(String args[])
	{
		int n1 = 8595; int n2 =3252;
	    System.out.println(sum(n1));
	    System.out.println(sum(n2));
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n%9 == 0)
		{
			return 9;
		}
		else {
			return n%9;
		}
	}
}
