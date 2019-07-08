package day02_test;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14;
		System.out.print("请输入圆的半径: ");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		System.out.println("圆的周长为: "+PI*r*2);
	}

}
