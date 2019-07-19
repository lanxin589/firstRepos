package day02_test;

import java.util.Arrays;
import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入一个2位小数:");
		Scanner scanner=new Scanner(System.in);
		float f=scanner.nextFloat();
		int zhengshu=(int)f;
		int xiaoshu=(int)(f*100)-zhengshu*100;
		System.out.println("整数部分:"+zhengshu+",小数部分:"+xiaoshu);
		System.out.println("和:"+(zhengshu+xiaoshu));
	}

}
