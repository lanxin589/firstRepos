package day08;

public class Animal {
	int age;
	public void printInfo(){
		System.out.println("我是动物");
	}
}
class Bird extends Animal{
	String color;
	public Bird(){
		this.color="红色";
		this.age=4;
	}
	public void printInfo(){
		System.out.println("我是一只"+this.color+"的鸟！");
		System.out.println("我今年"+this.age+"岁了！");
	}
}
class Fish extends Animal{
	int weight;
	public Fish(){
		this.weight=5;
		this.age=2;
	}
	public void printInfo(){
		System.out.println("我是一只"+this.weight+"斤重的鱼！");
		System.out.println("我今年"+this.age+"岁了！");
	}
}
class Test{
	public static void main(String[] args) {
		Animal animal=new Bird();
		animal.printInfo();
		System.out.println();
		animal=new Fish();
		animal.printInfo();
	}
}
