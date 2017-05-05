package com.poli;

public class Main {

	public static void main(String[] args) {
		Animal lion = new Lion();
		Animal dog = new Dog();
		Animal duck = new Duck();
		Animal[] animalArray = {lion, dog, duck};//мы помещаем в масив Animal другие классы и компилятор не ругается. 
		//главное, чтобы эти классы имплементировали интерфейс. Так можно делать и с абстрактными классами.
		for (int i = 0; i < animalArray.length; i++) {
			animalArray[i].showMeYourVoice();//выведет специализированный метод для каждого класса.
		}

	}

}
