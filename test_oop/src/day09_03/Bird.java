package day09_03;

public class Bird extends Animal {
	String color;
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("我是一只"+color+"的鸟!");
		System.out.println("今年"+age+"岁了！");
	}

}
