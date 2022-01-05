package code_q;

import java.util.Arrays;
import java.util.TreeSet;

public class MergeWoSpace {

	public static void main(String args[])
	{
		long a[] ={1 ,3 ,5 ,7};long b[]={0 ,2 ,6 ,8 ,9};
		TreeSet<Long> t1= new TreeSet<Long>();
		for(long i:a)
		{
			t1.add(Long.valueOf(i));
		}
		for(long i:b)
		{
			t1.add(Long.valueOf(i));
		}
		//System.out.println(t1);
		Object[] c = t1.toArray();
		for(int i=0;i<a.length;i++)
		{
			a[i] = (int) c[i];
		}
		for(int i=0,j=a.length ;i<b.length;i++,j++)
		{
			b[i] = (int) c[j];
		}
		
		for(long i:a)
		{
			System.out.print(i);
		}
		System.out.println();
		for(long i:b)
		{
			System.out.print(i);
		}
	}
}
