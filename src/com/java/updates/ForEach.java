package com.java.updates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//take a comsumer object(funcational interface)
public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 5, 3, 3, 4, 4, 34, 2, 4, 4, 54, 32);

		// long type make a object of consumer
		/*
		 * Consumer<Integer> con=new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t);
		 * 
		 * } }; list.forEach(con);
		 */

		// this is sort compare to upper type
		/*
		 * Consumer<Integer>con=(Integer t)-> System.out.println(t);
		 * 
		 * list.forEach(con);
		 */

//this is very sort and use to real time
		list.forEach((Integer t) -> System.out.println(t));
	}
}
