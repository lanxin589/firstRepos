package day03_test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入基本工资:");
		Scanner input=new Scanner(System.in);
		int baseSalary=input.nextInt();
		System.out.println("该员工的工资细目为:");
		System.out.println("基本工资为:  "+baseSalary);
		System.out.println("物价津贴为:  "+baseSalary*0.40);
		System.out.println("房租津贴为:  "+baseSalary*0.25);
		System.out.println("员工薪水是:  "+(baseSalary+baseSalary*0.40+baseSalary*0.25));
	}

}
