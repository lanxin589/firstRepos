package day06_test;

import java.util.Scanner;

public class test09_01_inverseDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入5句话:");
		String[] s=new String[5];
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.print("第"+(i+1)+"句话:");
			s[i]=scanner.next();
		}
		System.out.println("逆序输出5句话:");
		for (int i = s.length-1; i >=0; i--) {
			System.out.println(s[i]);
		}
	}

}
