package day03_test;

import java.util.Scanner;

public class DayNumOfThisMonthBySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入月份:");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("该月31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("该月30天");
			break;
		case 2:
			System.out.println("请输入年份:");
			int year = input.nextInt();
			if(year<=0){
				System.out.println("输入的年份有误!");
				return;
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("闰年，该月29天");
			} else {
				System.out.println("平年，该月28天");
			}
			break;
		default:
			System.out.println("输入的月份有误!");
			break;
		}
	}

}
