package day06_test;

import java.util.Scanner;

public class test09_03_IsLegal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入10个数");
		int[] digit=new int[10];
		int legal1=0;
		int legal2=0;
		int legal3=0;
		int illegal=0;
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < digit.length; i++) {
			digit[i]=scanner.nextInt();
		}
		System.out.println("输入的10个数为:");
		for (int i : digit) {
			System.out.println(i);
		}
		for (int i = 0; i < digit.length; i++) {
			if(digit[i]==1){
				legal1++;
			}
			if(digit[i]==2){
				legal2++;
			}
			if(digit[i]==3){
				legal3++;
			}
			if(digit[i]!=1&&digit[i]!=2&&digit[i]!=3){
				illegal++;
			}
		}
		System.out.println("数字1的个数:"+legal1);
		System.out.println("数字2的个数:"+legal2);
		System.out.println("数字3的个数:"+legal3);
		System.out.println("非法字的个数:"+illegal);
	}

}
