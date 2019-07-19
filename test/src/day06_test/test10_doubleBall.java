package day06_test;

import java.util.Arrays;
import java.util.Scanner;

public class test10_doubleBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 系统产生的双色球，前六个代表红球，后一个代表蓝球
		int[] balls = new int[7];
		// 随机的红色球号码(1-33的整数)
		int[] boxes = new int[33];
		for (int i = 1; i <= boxes.length; i++) {
			boxes[i - 1] = i;
		}
		// 红色号码对应的开关
		boolean[] flags = new boolean[boxes.length];// 每个元素值默认为false
		// 随机6个红色球，需要去重处理
		for (int i = 0; i < balls.length - 1; i++) {
			int index;
			do {
				index = (int) (Math.random() * 33);// 随机boxes数组的下标，从而得到1-33的随机整数
			} while (flags[index] == true);
			balls[i] = boxes[index];// 将红色号码赋值给红色球
			flags[index] = true;
		}
		
		// 随机一个蓝色球
		balls[balls.length - 1] = (int) (Math.random() * 16);
		System.out.println("双色球:" + Arrays.toString(balls));
		// ---------------------------------------------------------------

		int[] userBalls = new int[7];
		System.out.println("请输入六个红球号码:(1-33)");
		Scanner scanner = new Scanner(System.in);
		// 录入红球并校验号码
		for (int i = 0; i < userBalls.length - 1; i++) {
			boolean flag = false;
			do {
				int inputRed = scanner.nextInt();
				if (inputRed < 1 || inputRed > 33) {
					System.out.println("您的输入有误，请重新输入第" + (i + 1) + "个红球");
					flag = true;
				}else {
					userBalls[i]=inputRed;
					flag=false;
				}
			} while (flag);
		}
		//录入蓝色球
		System.out.println("请输入蓝色球号码:(1-16)");
		userBalls[userBalls.length-1]=scanner.nextInt();
		int redCount=0;
		int blueCount=0;
		System.out.println("双色球:" + Arrays.toString(userBalls));
		for (int i = 0; i < balls.length-1; i++) {//随机
			for (int j = 0; j < userBalls.length-1; j++) {//输入
				if (balls[i]==userBalls[j]) {
					redCount++;
					break;
				}
			}
		}
	}

}
