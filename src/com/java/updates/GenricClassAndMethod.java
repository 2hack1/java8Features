package com.java.updates;

// <T> this is show thw genric type java17
class GenricClass<T> {

	public T check(T a, T b) {
		if (a instanceof Integer) {

			return (T) Integer.valueOf(((Integer) a) + ((Integer) b));
		} else if (a instanceof Double) {
			return (T) Double.valueOf(((Double) a) + ((Double) b));

		} else if (a instanceof String) {
			return (T) String.valueOf(((String) a) + ((String) b));

		}
		throw new IllegalArgumentException("Unsupported type");

	}
}

public class GenricClassAndMethod {
	public static void main(String[] args) {
		// make a integer object call method by a integer type
		GenricClass<Integer> obj = new GenricClass<>();
		System.out.println(obj.check(12, 13));
		// make a Double object call method by a Double type

		GenricClass<Double> Dobj = new GenricClass<>();
		System.out.println(Dobj.check(234.3234, 123.12423));

		// make a String object call method by a String type

		GenricClass<String> sobj = new GenricClass<>();
		System.out.println(sobj.check("kapil", "Agrawal"));

	}
}
