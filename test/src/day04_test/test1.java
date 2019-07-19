package day04_test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = -1;
		int min = -1;
		int n1;
		int count = 0;// 记录第几次输入,将max、min赋值为输入的第一个数
		while (true) {
			count++;
			System.out.println("请输入一个整数(输入0结束):");
			n1 = sc.nextInt();
			if (n1 == 0) {
				break;
			}
			if (count == 1) {//如果是第一次,就初始化max，min
				max = n1;
				min = n1;
			}
			if (n1 - max > 0) {
				max = n1;
			}
			if (n1 - min < 0) {
				min = n1;
			}
		}

		System.out.println("最大值是: " + max + " 最小值是: " + min);
		
	}
	
}
