package com.incapsulation;

public class Cat {

	private String color;//мы делаем ограничение доступа к полям
	private int weight;
	private String sex;

	public String getColor() {//и предоставляем методы которые дают возможность работать с ними
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {//если кто-то укажет весь меньше 0, тогда программа пропишет 
		//вес по умолчанию: 4
		if (weight < 0)
			this.weight = 4;
		else
			this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {//если пол не совпадает с ключевыми словами, тогда задаем значение мужской пол
		if (sex.equals("man") || sex.equals("woman"))
			this.sex = sex;
		else
			this.sex = "man";

	}

}