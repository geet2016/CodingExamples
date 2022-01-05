package code_q;

public class TrailingZeros {

	public static void main(String args[])
	{
		/*Trailing 0s in n! = Count of 5s in prime factors of n!
                = floor(n/5) + floor(n/25) + floor(n/125) + ....*/
		int n = 25;
		System.out.println(tz(n));
	}
	public static int tz(int n)
	{
		if(n<5){
			return 0;
		}
		return n/5+tz(n/5);
	}
}
