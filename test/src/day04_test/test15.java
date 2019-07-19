package day04_test;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入一个整数(输入0结束):");
		Scanner scanner=new Scanner(System.in);
		int max=scanner.nextInt();
		int min=max;
		if (max==0) {
			System.out.println("程序结束！");
			return;
		}
		int n;
		do {
			System.out.print("请输入一个整数(输入0结束):");
			n=scanner.nextInt();
			if (n==0) {
				break;
			}
			max=max>n?max:n;
			min=min<n?min:n;
		} while (n!=0);
		System.out.println("最大值为："+max+",最小值为："+min);
	}

}
