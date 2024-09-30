package com.jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ab{
String a;

public String getA() {
	return a;
}

public void setA(String a) {
	this.a = a;
}

public ab(String a) {
	super();
	this.a = a;
}

}
public class MethodAnContructorRefrence {
 
	public static void name(String a) {
		System.out.println("dshfkj"+a);
	}
	
	public static void main(String[] args) {
		// //method refrence
		List<String>aList= Arrays.asList("kapil","aman","nakul");
//		aList.forEach(name->System.out.println(name));
//      aList.forEach(MethodAnContructorRefrence::name);
	
List<ab>aa=aList.stream().map(x->new ab(x)).collect(Collectors.toList());
List<ab>aaa=aList.stream().map(ab::new).collect(Collectors.toList());
		
aa.forEach(e->System.out.println(e));
aaa.forEach(e->System.out.println(e));
	}
}
