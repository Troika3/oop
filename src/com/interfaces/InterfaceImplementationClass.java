package com.interfaces;

//класс может имплементировать любое количество интерфейсов
public class InterfaceImplementationClass implements InterfaceExample {

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}
	//аннотация @Override говорит о том что метод переопределен
	@Override
	public String anotherMethod(String variable) {
		// TODO Auto-generated method stub
		return null;
	}

}
