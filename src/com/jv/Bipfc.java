package com.jv;

import java.awt.Robot;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.xml.transform.Source;

//BiPredicate , Bifunction,BiConsumer
public class Bipfc {

	public static void main(String[] args) {
		
//		Predicate<Integer>predicate=x ->x % 2==0;
//		BiPredicate<Integer, Integer>b=(x,y)->x%2==0 && y%2==0;
//		System.out.println(b.test(4, 6));
//		
//		if( predicate.test(100)) {
//			System.out.println("its even");
//		}else {
//			System.out.println("its not even");
//		}
		
	/*	BiPredicate<String, Integer>bi=(str,y)->str.length()==y;		
		  System.out.println( bi.test("kapil",5));
		*/
		//****Function interface hai***
		//Function<String,Integer>fun=str->str.length();
		//System.out.println(fun.apply("kapil"));
		
		/*BiFunction<String,Integer,Boolean>bi=(str,in)->str.length()==in;
		System.out.println(bi.apply("kapil",4)); */
		//******* Consumer interface not return the value 
		/*Consumer<String>consumer=(t)->{
			System.out.println(t.length());
		};
		consumer.accept("kapol");*/
		
		
		BiConsumer<Integer,Integer>consumer=(x,y)->{
			
			System.out.println(x+y);
		};
	 consumer.accept(2, 43); 
	}
}
