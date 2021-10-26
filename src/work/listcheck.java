package work;

import java.util.Arrays;
import java.util.List;

public class listcheck {

	public static void main(String args[])
	{
		String[] s = {"22000457,22000534,22000795"};
		List<String> s1 = Arrays.asList(s);
		String s11 = " 22000534 ";
		s1.contains(s11.trim());
		System.out.println(s1);
		System.out.println(s1.contains("22000534"));
	}
}
