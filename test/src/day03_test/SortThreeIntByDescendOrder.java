package day03_test;

import java.util.Scanner;

public class SortThreeIntByDescendOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三个整数:");
		Scanner input =new Scanner(System.in);
		int i1=input.nextInt();
		int i2=input.nextInt();
		int i3=input.nextInt();
		if (i1>i2) {
			if (i2>i3) {
				System.out.println(i1+" "+i2+" "+i3);
			}else{
				if (i1>i3) {
					System.out.println(i1+" "+i3+" "+i2);
				}else {
					System.out.println(i3+" "+i1+" "+i2);
				}
			}
		}else {
			if (i2>i3) {
				if (i3>i1) {
					System.out.println(i2+" "+i3+" "+i1);
				}else {
					System.out.println(i2+" "+i1+" "+i3);
				}
			}else {
				System.out.println(i3+" "+i2+" "+i1);
			}
		}
	}

}
