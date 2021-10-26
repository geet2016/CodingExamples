import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExamples {
public static void main(String args[])
{
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	//Unary operator as argument
	List<Integer> list2 = upAsArgs(list, x->x*2);
	System.out.println(list2);
	//Unary operator as argument + chain
	List<Integer> list3 = upAsArgsChain(list, x->x*2,x->x-1);
	System.out.println(list3);
	//
	Integer result = binop(list,0,(a,b)->a+b);
	System.out.println(result);
	int[] list1 = {1,2,3,4,5,6,7,8,9};
	System.out.println(binop1(list1,0,(a,b)->a+b));
}
public static <A1> List<A1> upAsArgs(List<A1> list ,
		UnaryOperator<A1> b)
{
	List<A1> list1 = new ArrayList<>();
	for(A1 a1:list)
	{
		list1.add(b.apply(a1));
	}
	return list1;
}
public static <A1> List<A1> upAsArgsChain(List<A1> list ,
		UnaryOperator<A1> b1,
		UnaryOperator<A1> b2)
{
	List<A1> list1 = new ArrayList<>();
	for(A1 a1:list)
	{
		list1.add(b1.andThen(b2).apply(a1));
	}
	return list1;
}
public static <A1> A1 binop(List<A1> list,A1 i,BinaryOperator<A1> func)
{
	A1 result = i;
	for(A1 a1 :list)
	{
		result = func.apply(result,a1);
	}
	 return result;
}
public static int binop1(int[] list,int i,IntBinaryOperator func)
{
	int result = i;
	for(int a1 :list)
	{
		result = func.applyAsInt(result,a1);
	}
	 return result;
}
}
