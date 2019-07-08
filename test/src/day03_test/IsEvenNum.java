package day03_test;

import java.util.Scanner;

public class IsEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数:");
		Scanner input =new Scanner(System.in);
		int digit=input.nextInt();
		if(digit%2==0){//判断是否为偶数
			String s="偶数";
			System.out.println(s);
		}
	}

}
