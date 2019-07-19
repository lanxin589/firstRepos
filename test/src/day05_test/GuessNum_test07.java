package day05_test;

import java.util.Scanner;

public class GuessNum_test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,4,2,1,23,344,12};
		System.out.print("请输入一个数:");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if (num==arr[i]) {
				flag=true;
				break;
			}
		}
		if (flag==true) {
			System.out.println("猜对了");
		}
		else {
			System.out.println("猜错了");
		}
	}

}
