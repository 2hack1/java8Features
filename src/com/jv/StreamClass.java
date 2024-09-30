package com.jv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// list of integers and store in the stream
		Stream<Integer> a = arr.stream().filter(x -> x % 2 == 0);
		a.forEach(e -> System.out.print(" " + e));
		System.out.println();
		// or//
		// System.out.println(a);

		// squar and store in the list
		List<Integer> aa = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		aa.forEach(e -> System.out.print(" " + e));
		System.out.println();
		System.out.println(aa);

		// if any operation will be perform on the stream the use the map() like see
		// this

		List<Integer> list = Arrays.asList(2, 3, 4, 56, 63, 1, 3, 43, 5, 6, 7, 8, 98, 64, 88);
//		Stream<Integer> st = list.stream().filter(e -> e % 2 != 0);
//		List<Integer> mapedList = st.map(x -> x * 2).collect(Collectors.toList());
//		System.out.println("convert odd to even no.=" +mapedList);
		

		// same work in one line
		//remove the duplicate value distinct() will be use
       //sort the order by using sorted() default min ton large no. but comparetor will be use
		// in comparator use desending order  sorted((ab,b)->(ab-b))  and assending order sorted((ab,b)->(b-ab))
		//List<Integer>list2=list.stream().filter(x->x%2!=0).map(e->e * 2).distinct().sorted().collect(Collectors.toList());
		//List<Integer>list2=list.stream().filter(x->x%2!=0).map(e->e * 2).distinct().sorted((ab,b)->(b-ab)).collect(Collectors.toList());
		//use limit then whose no of word will be come like limit(3)	
//		List<Integer>list2=list.stream().filter(x->x%2!=0).limit(3).map(e->e * 2).distinct().sorted((ab,b)->(b-ab)).collect(Collectors.toList());
	
		//use skip in starting no. of values
		List<Integer>list2=list.stream().filter(x->x%2!=0).limit(3).skip(1).map(e->e * 2).distinct().sorted((ab,b)->(b-ab)).collect(Collectors.toList());
//       System.out.print("convert odd to even no.="+list2);
	//0 to 100 no. spek 0 and condition come value only even and add 1 every no. then print first no	
//		Integer in=Stream.iterate(0,x->x+1)
//				.limit(101)
//				.skip(1).filter(x->x%2==0)
//				.map(x->x+1).filter(x->x>2)
//				.peek(System.out::println)
//				.max(( ba,b)->(b-ba)).get();		
//   System.out.println(in);
//   
		
		/*List<Integer> in=Stream.iterate(0,x->x+1)
				.limit(101)
				.skip(1).filter(x->x%2==0)
				.map(x->x+1).filter(x->x>2)				
				.collect(Collectors.toList());		
   System.out.println(in);
   
   in.forEach(e->System.out.print(" "+e)); */
		//the parallelStream same operation perform beu it use to big list because it divide the list in small chunks not use to more then 1 thread on  a list then work is esely to complete and not use small list 
		// it time consume on small list
		List<Integer>list3=Arrays.asList(1,3,4,5,6,78,4,6,34,343,453,5632,4,2365,3,3,253,5,6,654,3,5,543,5,34,53,245,3);
        list.parallelStream();
   
	}
}
