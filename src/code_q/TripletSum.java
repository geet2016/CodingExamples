package code_q;
import java.util.*;
import java.util.stream.Collectors;

public class TripletSum {
	
	public static void main(String args[])
	{
		int[] arr ={9, 8, 2, 1, 12, 7, 5};//{12 ,8 ,2 ,11 ,5 ,14 ,10};//{6 ,11 ,2 ,9 ,5};// {2, 3, 4};//{1, 5, 3, 2};
		System.out.println(countTriplet(arr));
	}

	public static int countTriplet(int arr[]) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		/*List<Integer> list = new ArrayList<Integer>();
		for(int i:arr)
		{
			list.add(Integer.valueOf(i));
		}*/
		List<Triplet> trilist = new ArrayList<Triplet>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j)
				{
					continue;
				}
				if (list.contains(arr[i] + arr[j])) {
					int n1 = arr[i]; int n2 = arr[j];
					if(!trilist.stream().anyMatch(p -> p.n1 == n2) 
							&& !trilist.stream().anyMatch(p -> p.n2 == n1)){
					Triplet t = new Triplet(arr[i], arr[j], arr[i] + arr[j]);
					trilist.add(t);
					System.out.println(t.n1+","+t.n2);
					}
				}
			}
		}
		return trilist.size();
	}

}

class Triplet {
	public int n1;
	public int n2;
	public int sum;

	Triplet(int n1, int n2, int sum) {
		this.n1 = n1;
		this.n2 = n2;
		this.sum = sum;
	}
}