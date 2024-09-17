package com.jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		System.out.println("kapil");
		Function<String,Integer>f1=e->e.length();
		System.out.println(f1.apply("kal"));
		Function<String ,String>f2=e->e.substring(0, 3);
		System.out.println(f2.apply("hello"));
		
				
		
			
			}
			
	
        
	
	
}
