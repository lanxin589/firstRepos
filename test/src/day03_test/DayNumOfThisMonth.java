package day03_test;

import java.util.Scanner;

public class DayNumOfThisMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入月份:");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("输入错误,请重新输入");
			return;
		}
		if (month == 2) {
			System.out.println("该月28/29天");
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("该月31天");
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("该月30天");
		}
	}

}
