package day03_test;

import java.util.Scanner;

public class DisplayWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入0-6之间的数字:");
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		switch (num) {
		case 0:
			System.out.println("星期天");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("输入有误！");
			break;
		}
	}

}
