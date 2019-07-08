package day03_test;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份:");
		Scanner input =new Scanner(System.in);
		int year=input.nextInt();
		String s=((year%4==0&&year%100!=0)||(year%400==0))?"闰年":"平年";
		System.out.println(s);
	}

}
