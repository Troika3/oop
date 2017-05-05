package com.poli;

public class MethodOverloading {
	
	public void method(){
		System.out.println("Method without parameters");
	}
	
	public void method(String oneParameter){
		System.out.println("Method with one parameter");
	}
	
	public void method(int intParam){
		System.out.println("Method with int parameter");
	}
	
	public void method(int intParam, String stringParam, long longParam){
		System.out.println("Method with 3 parameters");
	}
	
	public void method(String... value){
		System.out.println("Method with one and more parameters");
	}

	public static void main(String[] args) {
		MethodOverloading meOverloading = new MethodOverloading();
		meOverloading.method();
		meOverloading.method(3);
		meOverloading.method("One param");
		meOverloading.method(3, "", 3);
		meOverloading.method("","","");
		

	}

}
