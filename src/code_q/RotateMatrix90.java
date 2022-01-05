package code_q;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix90 {

	public static void main(String args[]) {
		
		int[][] a =/* { { 1, 2, 3}, {4 , 5, 6},{ 7, 8 , 9}, {10, 11, 12 } }; */{ 
				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
        ArrayList<Integer> list= new ArrayList<Integer>();
        Arrays.stream(a).flatMapToInt(p ->{
        	return Arrays.stream(p);
        }).forEach(q -> list.add(Integer.valueOf(q)));
        Object b[] = list.toArray(); 
        int[][] d = new int[a[0].length][a.length];
    	
        int k=0;
        System.out.println(a.length+","+a[0].length);
		for(int i=0;i<d[0].length;i++)
		{
			for (int j = d.length - 1; j>=0;j--)
			{
				d[j][i] = (int) b[k];
				k++;
			}
		}
		System.out.println();
		
	}
}
