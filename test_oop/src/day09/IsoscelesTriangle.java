package day09;

public class IsoscelesTriangle extends Test01_Graph{
	private double right_angle_side;//直角边
	public IsoscelesTriangle(){
		right_angle_side=CIRCLE/(2+Math.sqrt(2));
	}
	public double caculArea(){
		return right_angle_side*right_angle_side/2;
	}
}
