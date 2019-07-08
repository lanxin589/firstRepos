package day04_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String str = "";
		int num;
		boolean flag = false;
		while (true) {
			System.out.print("请输入数字1-7(输入0结束): ");
			num = scanner.nextInt();
			switch (num) {
			case 0:
				flag = true;
				break;
			case 1:
				str = "MON";
				break;
			case 2:
				str = "TUE";
				break;
			case 3:
				str = "WED";
				break;
			case 4:
				str = "THU";
				break;
			case 5:
				str = "FRI";
				break;
			default:
				str = "输入错误，请重新输入!";
				break;
			}
			if (flag == true) {
				break;
			}
			System.out.println(str);
		}

		System.out.println("程序结束!");

	}

}
