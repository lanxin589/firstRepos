package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputR {
	double r;

	public void setR(double r) {//输入半径
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入半径:");
		try {
			r=sc.nextDouble();
			if (r<=0) {
				throw new InputMismatchException();
			}else {
				this.r=r;
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("请再次录入半径");
			setR(r);
			return;
		}finally {
			sc.close();
		}
		
	}

	public String calcArea() {//计算面积
		final double PI=3.14;
		try {
			if (this.r>=10) {
				throw new CalAreaException("输入半径太大");
			}
		}catch (CalAreaException e) {
			// TODO: handle exception
			e.printStackTrace();
			return "周长为:"+2*PI*this.r;
		}
		return "面积为:"+PI*r*r;
	}
	public static void main(String[] args) {
		InputR ir=new InputR();
		ir.setR(0.0);
		System.out.println(ir.calcArea());
	}
}
