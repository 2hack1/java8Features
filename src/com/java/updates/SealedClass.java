package com.java.updates;

// add a restriction whose class extend or not than give a permit
sealed class Human permits Man, Woman {

	public void check() {
		System.out.println("parent class");
	}
}

non-sealed class Man extends Human {
	@Override
	public void check() {

		System.out.println("this is man");
	}
}

non-sealed class Woman extends Human {
	@Override
	public void check() {
		System.out.println("this is woman");
	}
}

public class SealedClass {

	public static void main(String[] args) {

		Human human = new Human();
		human.check();

		Human ma = new Man();
		ma.check();
		Man m = new Man();
		m.check();

		Human wo = new Woman();
		wo.check();
		Woman w = new Woman();
		w.check();

	}

}
