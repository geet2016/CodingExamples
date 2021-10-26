import java.util.*;
import java.util.function.*;
/*import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;*/

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
	/*Function*/
	Function<String,Integer> func3= x->x.length();
	Integer result3 = func3.apply("mkyong");
	System.out.println(result3);
	
	Predicate<Integer> predicate = v -> v==3;
	boolean result4 = predicate.test(4);
	System.out.println(result4);
	
	//Function has input output of different datatypes or same datatypes
	//UnaryOperator has input output of same datatypes
	//In Java 8, UnaryOperator is a functional interface and it extends Function.
	UnaryOperator<Integer> unaryoperator = x ->x+5;
    Integer result5 = unaryoperator.apply(10);
    System.out.println(result5);
	
    //two inputs and result all three must be of same datatype
    //In Java 8, BinaryOperator is a functional interface and it extends BiFunction
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
    
    /*Predicate Composition :The Predicate and() method is a default method*/
    Predicate<String> f1 = s -> s.endsWith("e");
    Predicate<String> f2 = s -> s.startsWith("a");
    Predicate<String> f3 = s -> f1.test(s) && f2.test(s);
    
    System.out.println(f3.test("apple"));
    
    Predicate<String> f4 = f1.and(f2);
    System.out.println(f4.test("apple"));
    Predicate<String> f5 = f1.or(f2);
    System.out.println(f5.test("apples"));
    
    /*Function Composition :andThen() works opposite of compose(). 
    Therefore, calling a.andThen(b) is actually the same as calling b.compose(a)*/
    Function<Integer,Integer> f6 = x -> x+3;
    Function<Integer,Integer> f7 = x -> x*2;
    Function<Integer,Integer> f8 = f7.compose(f6);
    System.out.println(f8.apply(3));
    Function<Integer,Integer> f9 = f7.andThen(f6);
    System.out.println(f9.apply(3));
    
    /////////////////////////////////
    
    LambdaEx l = new LambdaEx();
    List<String> list = Arrays.asList("Java","c++","python");
    Map<String,Integer> map = l.listToMap(list, func -> func.length());
    Map<String,Integer> map1 = l.listToMap(list, l::getLength);
    System.out.println(map); System.out.println(map1);
    List<String> list1 = l.listToList(list, func -> func.charAt(0));
    System.out.println(list1);
    
    /////////////////////////////////
    /*BiFunction*/
    BiFunction<Integer,Integer,Integer> func10 = (x, y) -> x+y;
    System.out.println(func10.apply(11,12));
    
    BiFunction<Integer,Integer,List<Integer>> func11 = (x,y) -> Arrays.asList(x+y);
    List<Integer> list2 = func11.apply(11,12);
    System.out.println(list2);
 
   /* BiFunction+Function*/
    Function<List<Integer>,String> func12 = (x) -> x.get(0).toString();
    System.out.println(func11.andThen(func12).apply(11, 12));
    
    System.out.println(powerToString(2,4,
    		(x1,x2)->Math.pow(x1,x2),x3->x3.toString()));
    
    List<String> pl = Arrays.asList("node", "c++", "java", "javascript");
    List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
    
    List<String> final1 = filterList(pl,"c", 
    		(pl1,c1) -> {
                      	if (pl1.startsWith(c1)) {
                          return pl1;
                        } 
                      	else {
                          return null;
                        }
                        });
    System.out.println(final1);
    
    List<Integer> final2 = filterList(number, 2, 
    		(n1,c1)-> {
    			if(n1%2 == 0)
    			{
    				return n1;
    			}
    			else{
    				return null;
    			}
    		});
    System.out.println(final2);
}
 
   public <T,R> Map<T,R> listToMap(List<T> list ,Function<T,R> func)
   {
	Map<T,R> map = new HashMap<>();
	for(T t:list)
	{
		map.put(t,func.apply(t));
	}
	return map;
   }
   
   public <T,R> List<T> listToList(List<T> list,Function<T,R> func)
   {
	   List<T> list2 = new ArrayList<>();
	   for(T t:list)
	   {
		   list2.add((T) func.apply(t));
	   }
	   return list2;
   }
   public Integer getLength(String str) {
       return str.length();
   }
  /* public static <R> R powerToString(Integer i1,Integer i2,
		   BiFunction<Integer,Integer,Double> func1 ,
		   Function<Double,R> func2
		   )
   {
	  return  func1.andThen(func2).apply(i1, i2);
   }*/
   
   //More generic approach
   public static <A1,A2,A3,A4> A4 powerToString(A1 i1,A2 i2,
		   BiFunction<A1,A2,A3> func1 ,
		   Function<A3,A4> func2
		   )
   {
	  return  func1.andThen(func2).apply(i1, i2);
   }
   
   public static <A1, A2, A3> List<A3> filterList(List<A1> list,
		   A2 condition,
		   BiFunction<A1,A2,A3> func)
   {
	   List<A3> list1= new ArrayList<>();
	   for(A1 a1:list)
	   {
		   A3 a3 = func.apply(a1,condition);
		   if(a3 != null)
		   {
			   list1.add(a3);
		   }
	   }
	   return list1;
   }
}
