package com.absclasses;

public class A {

	public static void staticMethod() {
		System.out.println("I'm static method of A class");
	}

	public void nonStaticMethod() {
		System.out.println("I'm method of A class");
	}

	public A(String b) {
		System.out.println("My superclass");
	}

	public static void main(String[] args) {
		B b = new B("string");
		A ab = new B("");
		b.nonStaticMethod();
		ab.nonStaticMethod();
		A.staticMethod();
		B.staticMethod();
	}
}

class B extends A {
	
	public B(String b) {//обязательное добавление конструктора с параметром
		//так как родитель имеет только его
		super(b);
		// TODO Auto-generated constructor stub
		
	}

	public static void staticMethod() {
		System.out.println("I'm static method of B class");
	}

	public void nonStaticMethod() {
		System.out.println("I'm method of B class");
	}

	/*
	 * public B() {//невозможно добавить конструктор по умолчанию когда такового
	 * нет у родителя // TODO Auto-generated constructor stub }
	 */

	

}
