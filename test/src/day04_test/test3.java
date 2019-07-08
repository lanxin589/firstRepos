package day04_test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入您出行的月份:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("您的输入有误！");
			return;
		} else {
			System.out.println("请问您选择头等舱还是经济舱?头等舱输入1，经济舱输入2");
			int num = scanner.nextInt();
			if (month >= 4 && month <= 10) {// 旺季
				if (num != 1 && num != 2) {
					System.out.println("您的输入有误！");
					return;
				}
				if (num == 1) {
					System.out.println("您的机票价格为:" + 5000 * 0.9);
				}
				if (num == 2) {
					System.out.println("您的机票价格为:" + 5000 * 0.6);
				}
			} else {// 淡季
				if (num != 1 && num != 2) {
					System.out.println("您的输入有误！");
					return;
				}
				if (num == 1) {
					System.out.println("您的机票价格为:" + 5000 * 0.5);
				}
				if (num == 2) {
					System.out.println("您的机票价格为:" + 5000 * 0.4);
				}
			}
		}
	}

}
