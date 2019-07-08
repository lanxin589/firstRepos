package day03_test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入本金:");
		Scanner input =new Scanner(System.in);
		double capital=input.nextInt();
		System.out.println("本金为: "+capital);
		System.out.println();
		System.out.println("存取一年后的本息是: "+capital*(1+0.0225));
		System.out.println();
		System.out.println("存取两年后的本息是: "+capital*(1+0.027*2));
		System.out.println();
		System.out.println("存取三年后的本息是: "+capital*(1+0.0324*3));
		System.out.println();
		System.out.println("存取五年后的本息是: "+capital*(1+0.036*5));
	}

}
