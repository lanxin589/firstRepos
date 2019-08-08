package day09_03;

public class Fish extends Animal {
	int weight;
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("我是一条"+weight+"重的🐠");
		System.out.println("今年"+age+"岁了!");
	}

}
