package com.absclasses;

public class AbstractClassExtension extends AbstractClass {

	
	@Override
	public void myMethod() {//реализовать обязательно только абстрактный метод
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args){
		AbstractClassExtension abs = new AbstractClassExtension();
		System.out.println(abs.myVar);//все поля и методы наследуются
		System.out.println(abs.myMethodWithBody(4));
	}

}
