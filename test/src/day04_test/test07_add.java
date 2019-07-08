package day04_test;

import java.util.Scanner;

public class test07_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 1;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("开始5次乘法测试");
		while (time <= 5) {
			int p1 = (int) (Math.random() * 50 + 1);// (1-50随机数)乘数1
			int p2 = (int) (Math.random() * 50 + 1);// (1-50随机数)乘数2
			System.out.println("(" + time++ + ") " + p1 + " * " + p2 + "=?");
			System.out.println("请输入答案(输入-1退出):");
			int answer = input.nextInt();
			if (answer == -1) {
				System.out.println("退出测试");
				time = 6;// break
			} else {
				if (answer == p1 * p2) {
					System.out.println("对了!");
					count++;
				} else {
					System.out.println("错了!");
				}
			}
		}
		System.out.println("此次测试结果:答对了" + count + "题。");
	}

}
