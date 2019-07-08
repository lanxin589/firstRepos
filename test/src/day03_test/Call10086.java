package day03_test;

import java.util.Scanner;

public class Call10086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入您要进行的操作:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
//		default不一定只放到最后
		switch (num) {
		case 1:
			System.out.println("业务服务");
			break;
		case 2:
			System.out.println("业务查询");
			break;
		case 3:
			System.out.println("手机充值");
			break;
		case 4:
			System.out.println("密码服务与停复机");
			break;
		case 9:
			System.out.println("宽带管理");
			break;
		case 0:
			System.out.println("人工服务");
			break;
		default:
			System.out.println("输入有误!");
			break;
		}
	}

}
