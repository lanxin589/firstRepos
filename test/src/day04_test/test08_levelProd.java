package day04_test;

import java.util.Scanner;

public class test08_levelProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数n:");
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		long prod=1l;
		for (int i = 1; i <= n; i++) {
			prod*=i;
		}
		System.out.println("该数的阶乘为:"+prod);
	}

}
