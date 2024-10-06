package com.java.updates;

import java.awt.Checkbox;
import java.security.PublicKey;

//@FunctionalInterface
interface Demo {

	// public void check(String a);

	default void check1(int a) {
		System.out.println(a);
	}

	static void check2(int a) {
		System.out.println(a);
	}
}

public class FunctionalInter {

	public static void main(String[] args) {

		// make a anonimus class call interface fuction
		/*
		 * Demo aDemo=new Demo() {
		 * 
		 * @Override public void check(String a) {
		 * 
		 * System.out.println(a); }
		 * 
		 * };
		 * 
		 * aDemo.check("dsnl"); aDemo.check1(23);
		 */

		// call the interface by a lemda expression
		/*
		 * Demo demo=(String a)->{
		 * 
		 * System.out.println(a);
		 * 
		 * }; demo.check("call by lembda expression"); demo.check1(12+22);
		 */

		// when have a only default funtion
		/*
		 * Demo demo=new Demo() {
		 * 
		 * }; demo.check1(34); Demo.check2(23);
		 */
		
		// only call by interface name because it is static
		// demo.check2(23);

	}
}
