package day04_test;

import java.util.Scanner;

public class test10_addTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个值");
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
		for (int i = 0,j=value; i <= value&&j>=0; i++,j--) {
			System.out.println(i+" + "+j+" = "+(i+j));
		}
	}

}
