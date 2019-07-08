package day04_test;

import java.util.Scanner;

public class test01_rankingScoreBySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩:");
		Scanner input =new Scanner(System.in);
		int score=(int)input.nextDouble();
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A级");
			break;
		case 8:
			System.out.println("B级");
			break;
		case 7:
			System.out.println("C级");
			break;
		case 6:
			System.out.println("D级");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("E级");
			break;
		default:
			System.out.println("成绩输入错误！");
			break;
		}
	}

}
