package day02_test;

import java.util.Scanner;

public class InputAndDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入4位会员卡号: ");
		int cardNum=sc.nextInt();
		System.out.println("会员卡号是: "+cardNum);
	}

}
