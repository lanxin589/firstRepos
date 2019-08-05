package day09;

import java.util.Arrays;

public class Test01 {
	Test01_Graph[] graphs={
			new Circle(),
			new Square(),
			new IsoscelesTriangle()
	};
	private double[] arr={graphs[0].caculArea(),graphs[1]
			.caculArea(),graphs[2].caculArea()};
	public double maxArea(double arr[],int index){
		double area;
		if (index==0) {
			return arr[0];
		}else {
			area=maxArea(arr, index-1);
			return area>arr[index]?area:arr[index];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 test01=new Test01(); 
		double area=test01.maxArea(test01.arr, test01.arr.length-1);
		if (area==test01.graphs[0].caculArea()) {
			System.out.println("圆的面积最大");
		}
		if(area==test01.graphs[1].caculArea()){
			System.out.println("正方形的面积最大");
		}
		if (area==test01.graphs[2].caculArea()) {
			System.out.println("等腰直角三角形的面积最大");
		}
	}

}
