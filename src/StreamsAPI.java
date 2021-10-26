import java.util.*;
import java.util.ArrayList;
import java.util.stream.*;

public class StreamsAPI {
	public static void main(String args[]){
	
		
		Stream<String> streamOf = Stream.of("one", "two", "three");
		int[] aa= {1,2,32,43,4,5};
		Stream<int[]> streamOf1 = Stream.of(aa);	
		List<String> list =new ArrayList<>();
		list.add("one");list.add("two");list.add("three");list.add("four");
		Stream<String> stream = list.stream();
		List<Character> mapList = stream.map(s -> s.charAt(0)).collect(Collectors.toList());
		System.out.println(mapList);
		//convert list of stream to set
		Set<String> set = new HashSet<>();
		Stream <String> stream1 = list.stream();
		stream1.map(s -> s.substring(0,2)).forEach(set::add);
		//set.forEach(s -> System.out.println(s));
		System.out.println(set);
		Set< String> set1 = list.stream().collect(Collectors.toSet());
		System.out.println(set1);
	
		Stream stream2 = list.stream().filter(s -> {
			return s.startsWith("t");
		});
		List<String> list2 = (List<String>) stream2.collect(Collectors.toList());
		System.out.println(list2);
		
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream3 = stringList.stream();

		List<String> flatsList = stream3.flatMap((value) -> {
		    String[] split = value.split(" ");
		    return (Stream<String>) Arrays.asList(split).stream();
		}).collect(Collectors.toList());
		System.out.println(flatsList);
		
	List<List<Integer>> numberList = new ArrayList<>();
	numberList.add(Arrays.asList(1,2));numberList.add(Arrays.asList(3,4));numberList.add(Arrays.asList(5,6));
	List<Integer> flatnList = numberList.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
	System.out.println(flatnList);
	
	List<String> stringList1 = new ArrayList<String>();

	stringList1.add("one");
	stringList1.add("two");
	stringList1.add("three");
	stringList1.add("one");
	 
	List<String> stringList2 =stringList1.stream().distinct().collect(Collectors.toList());
	System.out.println(stringList2);
	
	List<String> stringList3 =stringList1.stream().limit(2).collect(Collectors.toList());
	System.out.println(stringList3);
	
	List<String> stringList4 = new ArrayList<String>();

	stringList4.add("abc");
	stringList4.add("def");
	stringList4.add("ghi");
	stringList4.add("jkl");
	stringList4.stream().peek(s -> System.out.println(s));

	System.out.println(stringList4.stream().map(s -> s.length()).count());
	
	System.out.println(stringList4.stream().anyMatch(s -> s.startsWith("d")));
	
	System.out.println(stringList4.stream().allMatch(s -> s.startsWith("d")));
	
	System.out.println(stringList4.stream().noneMatch(s -> s.startsWith("t")));
	
	Optional<String> anyelement = stringList4.stream().findAny();
	if(anyelement.isPresent())
	{
		System.out.println(anyelement.get());
	}
	Optional<String> firstelement = stringList4.stream().findFirst();
	if(anyelement.isPresent())
	{
		System.out.println(firstelement.get());
	}
	
	Optional<String> min = stringList4.stream().min((val1, val2) -> {
	    return val1.compareTo(val2);
	});

	System.out.println(min.get());
	
	Optional<String> max = stringList4.stream().max((val1, val2) -> {
	    return val1.compareTo(val2);
	});

	System.out.println(max.get());
	
	List<String> stringList5 = new ArrayList<String>();

	stringList5.add("One flew over the cuckoo's nest");
	stringList5.add("To kill a muckingbird");
	stringList5.add("Gone with the wind");

	Optional<String> reduced = stringList5.stream().reduce((value, combinedValue) -> {
	    return value+"+"+combinedValue ;
	});
	System.out.println("reduce------------");
	System.out.println(reduced.get().toString());
	
	Object[] objects = stringList5.stream().toArray();
	
	
	List<String> stringList6 = new ArrayList<String>();

	stringList6.add("One flew over the cuckoo's nest");
	stringList6.add("To kill a muckingbird");
	stringList6.add("Gone with the wind");

	Stream<String> stream16 = stringList6.stream();

	List<String> stringList7 = new ArrayList<>();
	stringList7.add("Lord of the Rings");
	stringList7.add("Planet of the Rats");
	stringList7.add("Phantom Menace");

	Stream<String> stream17 = stringList7.stream();

	Stream<String> concatStream = Stream.concat(stream16, stream17);

	List<String> stringsAsUppercaseList = concatStream
	        .collect(Collectors.toList());

	System.out.println(stringsAsUppercaseList);
	
	}
	

}
