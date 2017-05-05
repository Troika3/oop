package com.absclasses;

public class Cat extends Animal {//можно унаследоваться от кота и получить еще более конкретное животное
	
	public void gettingParentField(){
		System.out.println(super.someFieldWithValue);//ключевое слово super для получение полей и методов родителя
		super.someMethodFromParent();
	}
	
	
	public void catsOwnMethod(){
		System.out.println("I'm catching mouse");
	}
	
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.countOfLegs = 4;
		cat.name = "Cat";
		cat.voice = "Meaou";
		cat.introduction();
		System.out.println(cat.getVoice());
		cat.catsOwnMethod();
		cat.gettingParentField();
	}
}
