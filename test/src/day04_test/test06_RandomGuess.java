package day04_test;

import java.util.Scanner;

public class test06_RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = (int) (Math.random() * 100+1) ;// 生成[1,100]间的随机数
		System.out.println(random);
		System.out.println("请输入一个数字");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		while (num != 0) {
			if (num == random) {
				System.out.println("猜对了，游戏结束");
				break;
			}
			if (num < random) {
				System.out.println("猜小了");
			}
			if (num > random) {
				System.out.println("猜大了");
			}
			num = input.nextDouble();
		}
		System.out.println("退出猜测");
	}

}
