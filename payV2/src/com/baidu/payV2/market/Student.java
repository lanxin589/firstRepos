package com.baidu.payV2.market;

public class Student {
	String name;
	int age;
	char sex;
	public Student(String name, int age, char sex) {
		this(name, age);
		this.sex = sex;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(char sex) {
		this.setSex(sex);
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	public static void main(String[] args) {
		
	}
}
