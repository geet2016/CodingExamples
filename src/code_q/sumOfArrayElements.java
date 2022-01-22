package code_q;

public class sumOfArrayElements {

	public static void main(String args[]) {
		int [] a = {1,2,3,4,5,6};
		System.out.print(sumarr(a,0,0));
	}
	public static int sumarr(int[] a,int index,int sum) {
		if(index == a.length)
		{
			return sum;
		}
		
		sum += a[index];
		return sumarr(a,index+1,sum);
	}
}
