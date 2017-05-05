package com.interfaces;

//вместо class пишем interface
public interface InterfaceExample {//в интерфейсе находятся методы
	//в интерфейсе можно объявлять константы
	
	String CONST = "My constant";//по умолчанию, все поля static, final public
	
	void myMethod();//по умолчанию все методы public, abstract
	
	String anotherMethod(String variable);

	//начаная с Java 8 в интерфейсах возможна реализация методов
	//но пока будем считать, что можно только объявлять методы
}
