package com.absclasses;

public class Animal {
	
	public String name;
	public int countOfLegs;
	public String voice;
	public String someFieldWithValue = "My animal value";
	public void introduction(){
		System.out.println("Hello I'm " + name + " I have " + countOfLegs + " legs");
	}
	
	public String getVoice(){
		return voice;
	}
	
	public void someMethodFromParent(){
		System.out.println("I love people");
	}

}
