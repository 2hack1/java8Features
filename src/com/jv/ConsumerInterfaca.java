package com.jv;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerInterfaca {

	public static void main(String[] args) {
		//the Consumer is a interface that's allows as a use the function not return the value (cunsum the value)
	//	Consumer<String>consumer=e ->System.out.println(e);
	//	consumer.accept("kapil");
		Consumer<List<Integer>> con1=list->{
			for(int i:list) {
				System.out.println(i+100);
			}
		};
	//	con.accept(Arrays.asList(1,2,3,4,5,6,7));
	
		Consumer<List<Integer>>con2=li->{
			
			for(int i:li) {
				System.out.println(i);
			}
		};
		//con1.andThen(con2).accept(Arrays.asList(1,2,3,4,5,6,7));
	Consumer<List<Integer>>consumer=con1.andThen(con2);
	consumer.accept(Arrays.asList(1,2,3,4,5));
	//the supplier is only return the value
	Supplier<Integer>sup=()->1;
	System.out.println(sup.get());
		
	
	}
	
}
