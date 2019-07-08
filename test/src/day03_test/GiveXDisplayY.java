package day03_test;

import java.util.Scanner;

public class GiveXDisplayY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入x的值:");
		Scanner input =new Scanner(System.in);
		double x=input.nextDouble();
		if(x>0){
			System.out.println("y=1");
		}else if (x<0) {
			System.out.println("y=-1");
		}else {
			System.out.println("y=0");
		}
	}

}
