package day02_test;

import java.util.Scanner;

public class CollectMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入单价(￥):");
		Scanner scanner=new Scanner(System.in);
		double d1=scanner.nextDouble();
		System.out.println("请输入数量:");
		int num=scanner.nextInt();
		System.out.println("客户付款金额(￥):");
		double d2=scanner.nextDouble();
		System.out.println("客户应收金额(￥):￥"+d1*num+",找零:￥"+(d2-d1*num));
	}

}
