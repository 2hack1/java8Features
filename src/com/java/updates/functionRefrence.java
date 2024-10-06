package com.java.updates;

import javax.sql.rowset.JoinRowSet;
@FunctionalInterface
interface Calculate{
	public int clc(int a,int b) ;
	default int Cal(int a,int b) {
		return a-b;
	}
	default int ByNonstatic(int a,int b) {
		
		return a*b;
	}
	
	
}

class opr{
	
	public static int add(int a,int b) {
		
		return a+b;
	}
	public static int sub(int a,int b) {
	return 0;
		
	}
	public static int mul(int a,int b) {
	
		return a*b;
	}
	public int nonStatic(int b,int a) {
		return 0;
	}
}
public class functionRefrence {

	public static void main(String[] args) {
		
		
		Calculate a=opr::add;
		System.out.println("addition"+a.clc(1, 3));
		Calculate b=opr::mul;
		System.out.println("multiply "+b.clc(2, 4));
		
		Calculate c=opr::sub;
		System.out.println("subtracta "+c.clc(3, 1));
		  // ye default method ki body use karega 
		System.out.println(c.Cal(12,10));
	
//		opr aaOpr=new opr();
//		Calculate aC=aaOpr::nonStatic;
//		System.out.println(aC.ByNonstatic(12,53));
		
		
		
	}
	
}
