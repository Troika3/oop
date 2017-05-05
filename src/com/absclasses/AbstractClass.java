package com.absclasses;

public abstract class AbstractClass {
	
	public static int myVar = 0;//может содержать поля
	
	public abstract void myMethod();//методы без реализации
	
	public int myMethodWithBody(int variable){//методы с реализацией
		return variable;
	}

}
