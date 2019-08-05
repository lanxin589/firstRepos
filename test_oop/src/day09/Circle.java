package day09;

public class Circle extends Test01_Graph{
	private static final double PI=3.14;//π
	private double r=CIRCLE/2/PI;//半径
	public double caculArea(){
		return PI*r*r;
	}
	
}
