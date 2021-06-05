import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaEx {
public static void main(String args[]){
	
	/////////////////////////////////
	InterfaceEx<String,Integer> func1= x->x.length();
	Integer result1 = func1.apply("Hello There");
	System.out.println(result1);
	
	InterfaceEx<String,String[]> func2= x-> x.split(",");
	String[] result2 = func2.apply("Hello,there");
	System.out.println(result2[0]);
	System.out.println(result2[1]);
	
	/////////////////////////////////
	Function<String,Integer> func3= x->x.length();
	Integer result3 = func3.apply("mkyong");
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
    
    /*The Java Supplier interface is a functional interface that represents an function 
    that supplies a value of some sorts. The Supplier interface can also be thought
    of as a factory interface. Here is an example implementation of the Java Supplier
    interface: This Java Supplier implementation returns a new Integer instance with a 
    random value between 0 and 1000.*/
    	
    Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
    System.out.println(supplier.get());
    
 /*   The Java Consumer interface is a functional interface that represents an function 
    that consumes a value without returning any value. A Java Consumer implementation
    could be printing out a value, or writing it to a file, or over the network etc.
    Here is an example implementation of the Java Consumer interface:This Java Consumer
     implementation prints the value passed as parameter to it out to System.out.*/
    
    Consumer<Integer> consumer = (value) -> System.out.println(value);
    consumer.accept(1234);
    
    /*java functional composition*/
    /*The functional composition support comes in the shape of default and static methods in the functional interfaces.*/
    
    
    //Predicate Composition :The Predicate and() method is a default method
    Predicate<String> f1 = s -> s.endsWith("e");
    Predicate<String> f2 = s -> s.startsWith("a");
    Predicate<String> f3 = s -> f1.test(s) && f2.test(s);
    
    System.out.println(f3.test("apple"));
    
    Predicate<String> f4 = f1.and(f2);
    System.out.println(f4.test("apple"));
    Predicate<String> f5 = f1.or(f2);
    System.out.println(f5.test("apples"));
    
    //Function Composition :andThen() works opposite of compose(). 
    //Therefore, calling a.andThen(b) is actually the same as calling b.compose(a)
    Function<Integer,Integer> f6 = x -> x+3;
    Function<Integer,Integer> f7 = x -> x*2;
    Function<Integer,Integer> f8 = f7.compose(f6);
    System.out.println(f8.apply(3));
    Function<Integer,Integer> f9 = f7.andThen(f6);
    System.out.println(f9.apply(3));
 }

}
