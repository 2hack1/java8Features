package com.jv;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {
		Function<Integer, Integer> function = e -> e * e;
		System.out.println("square :" + function.apply(5));

		// same argument and return type of value that is use
		UnaryOperator<Integer> unary = (e) -> e * e;
		System.out.println(unary.apply(32));
		UnaryOperator<String> u = (t) -> t.toUpperCase();
		System.out.println(u.apply("aman"));

		// when both argument and return type will be same then use the binary operator
		// but this type not
		BiFunction<Integer, String, Integer> function2 = (x, y) -> x * (y.length());
		System.out.println(function2.apply(12, "kapil"));
		// this type
		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a * b;
		System.out.println(bi.apply(5, 7));

		// make a binaryoperator of this bifunction
		BinaryOperator<Integer> Bi = (a, b) -> a * b;
		System.out.println(bi.apply(5, 7));

		// same use in the String way
		BiFunction<String,String,String>biFunction=(a,b)->(a+b).toUpperCase();
      System.out.println(biFunction.apply("Str","ing"));
      //Binaryoperator
      
      BinaryOperator<String>biF=(a,b)->(a+b).toUpperCase();
      System.out.println(biF.apply("Str","ing"));
	}
}
