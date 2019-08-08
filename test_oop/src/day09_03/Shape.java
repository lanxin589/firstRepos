package day09_03;

public abstract class Shape {
	public abstract double getArea();
}
class Square extends Shape{
	private double height=0;

	public Square(double height) {
		super();
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.height*this.height);
	}
	
}
class Circle extends Shape{
	private double r=0;
	private static final double PI=3.14;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}
	
}
class TestShape{
	public static void main(String[] args) {
		Shape square=new Square(3);
		Shape circle=new Circle(2);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
		Square sq=(Square)circle;//Circle与Square没有继承关系，不能向下转型，且向下转型前最好用instanceof判断
		System.out.println(sq.getArea());
	}
}