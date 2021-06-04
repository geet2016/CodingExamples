import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaEx {
public static void main(String args[]){
	InterfaceEx<String,Integer> func1= x->x.length();
	Integer result1 = func1.apply("Hello There");
	System.out.println(result1);
	
	InterfaceEx<String,String[]> func2= x-> x.split(",");
	String[] result2 = func2.apply("Hello,there");
	System.out.println(result2[0]);
	System.out.println(result2[1]);
	/////////////////////////////////
	Function<String,Integer> func3= x->x.length();
	Function<Integer,Integer> func4= x-> x*2;
	Integer result3 = func3.andThen(func4).apply("mkyong");
	System.out.println(result3);
	
	Predicate<Integer> predicate = v -> v==3;
	boolean result4 = predicate.test(4);
	System.out.println(result4);
	
	//Function has input output of different datatypes or same datatypes
	//UnaryOperator has input output of same datatypes
	UnaryOperator<Integer> unaryoperator = x ->x+5;
    Integer result5 = unaryoperator.apply(10);
    System.out.println(result5);
	
    //two inputs and result all three must be of same datatype
    BinaryOperator<Integer> binaryoperator = (value1,value2) -> { 
    	return value1 + value2 ;
    };
    
    Integer result6 = binaryoperator.apply(10,10);
    System.out.println(result6);
}

}
