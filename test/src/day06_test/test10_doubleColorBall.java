package day06_test;

import java.util.Arrays;
import java.util.Scanner;

public class test10_doubleColorBall {
	static int redBallCount=0;
	static int blueBallCount=0;
	static int[] redBall = new int[6];// 红球
	static int[] redBallInput = new int[6];
	static int blueBallInput = 0;
	static int blueBall=0;// 蓝球
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BallsResult();
		
		//-----------
		RightCount();
		//------
		getRewardsResult();
	}
	public static void BallsResult(){
		redBall[0] = (int) (Math.random() * 33 + 1);
		for (int i = 1; i < redBall.length; i++) {
			redBall[i] = (int) (Math.random() * 33 + 1);
			for (int j = 0; j < i; j++) {// 和之前的随机数做判断
				if (redBall[i] == redBall[j]) {// 如果从第2项起与之前有相同的就重新获取
					redBall[i] = (int) (Math.random() * 33 + 1);
					j = -1;// 如果有相同，重新从第1项开始比
				}
			}

		}
		blueBall = (int) (Math.random() * 16 + 1);
		System.out.println("红球号码为:");
		for (int i = 0; i < redBall.length; i++) {
			System.out.print(redBall[i] + " ");
		}
		System.out.println("\n蓝球号码为:");
		System.out.println(blueBall);
		
	}
	public static void RightCount(){
		System.out.println("请输入6个红球号码:");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < redBallInput.length; i++) {
			redBallInput[i] = input.nextInt();
			if (redBallInput[i] < 1 || redBallInput[i] > 33) {
				System.out.println("红球输入有误,请重新输入!");
				i--;
			}
		}
		System.out.println("请输入蓝球号码:");
		do {
			blueBallInput = input.nextInt();
			if (blueBallInput < 1 || blueBallInput > 16) {
				System.out.println("蓝球输入有误,请重新输入!");
			}
		} while (blueBallInput < 1 || blueBallInput > 16);
		if (blueBall == blueBallInput) {
			blueBallCount = 1;
		}
		for (int i = 0; i < redBallInput.length; i++) {// 输入的红球
			for (int j = 0; j < redBall.length; j++) {// 随机的红球
				if (redBallInput[i] == redBall[j]) {// 如果中奖，不再和其他随机红球比较
					redBallCount++;
					for (int j2 = 0; j2 < i; j2++) {// 和之前的输入相比
						if (redBallInput[i] == redBallInput[j2]) {//如果输入的有相同，且中奖，只算一个
							redBallCount--;//减掉多加的
							break;
						}
					}
					break;
				}
			}
		}
		System.out.println("猜对的红球个数:" + redBallCount);
		System.out.println("猜对的蓝球个数:" + blueBallCount);
	}
	public static void getRewardsResult(){
		if (redBallCount == 6 && blueBallCount == 1) {
			System.out.println("一等奖");
		} else if (redBallCount == 6 && blueBallCount == 0) {
			System.out.println("二等奖");
		} else if ((redBallCount == 5 && blueBallCount == 1)) {
			System.out.println("三等奖");
		} else if ((redBallCount == 5 && blueBallCount == 0) || ((redBallCount == 4) && (blueBallCount == 1))) {
			System.out.println("四等奖");
		} else if ((redBallCount == 4 && blueBallCount == 0) || ((redBallCount == 3) && (blueBallCount == 1))) {
			System.out.println("五等奖");
		} else if ((redBallCount == 2 && blueBallCount == 1) || ((redBallCount == 1) && (blueBallCount == 1))
				|| ((redBallCount == 0) && (blueBallCount == 1))) {
			System.out.println("六等奖");
		} else {
			System.out.println("谢谢惠顾，您没中奖!");
		}
	}
}
