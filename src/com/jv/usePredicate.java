package com.jv;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.function.Predicate;

public class usePredicate {

	
	public static void main(String[] args) {
		
		//*******simple********* 
		//Predicate<Integer>k=e->e<200;
		//System.out.println(k.test(22)); 
		/*Predicate<Integer>k=e->e%2==0;
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		for(Integer i:list) {
			if(k.test(i)) {
				System.out.println(i);
			}
		}*/
		/*Predicate<String>s=v->v.toLowerCase().charAt(0)=='a';
		System.out.println(s.test("hello"));// false
		System.out.println(s.test("apple"));//true
		System.out.println(s.test("Apple"));//true */
		
		//DEFAULT AND STATIC METHODS INSIDE THE PREDICATE INTERFACE
		
		
/*		Predicate<String>a=v->v.toLowerCase().charAt(0)=='a';
		Predicate<String>b=c->c.toLowerCase().charAt(c.length()-1)=='e';
//     Predicate<String>ab=a.and(b);
//     System.out.println(ab.test("kapile")); // false (beacause (start a)And (end e)==false
//	System.out.println(ab.test("apple"));//true by (and)

		
//		 Predicate<String>ab=a.or(b);
//	     System.out.println(ab.test("kapile")); // true (beacause (start a)or (end e)==false
//		System.out.println(ab.test("apple"));//true by (and)

//		 Predicate<String>ab=a.negate();// like not operator
//	     System.out.println(ab.test("kapile")); // false (beacause (start a)And (end e)==false
//		System.out.println(ab.test("apple"));//false by (negate())

 */
Predicate<Object>k=Predicate.isEqual("kapil");


//if(k.test("kapil")//true)
if(k.test("kapil")){
	System.out.println("its true ");
}else {
	System.out.println("it given false");
}

	} 
}
