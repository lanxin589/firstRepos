package day02_test;

import java.util.Scanner;

public class CardNumBitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入4位卡号: ");
		int num=sc.nextInt();
		int a=num/1000;//千位
		int b=num/100%10;//百位
		int c=num/10%10;//十位
		int d=num%10;//个位
		int sum=0;
		sum=a+b+c+d;
		System.out.println("4位卡号之和为: "+sum);
	}

}
