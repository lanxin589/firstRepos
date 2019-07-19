package day05_test;

import java.util.Scanner;

public class ReverseByScanner_test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("请输入一组数据:");
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入数组长度:");
		int len=scanner.nextInt();
		System.out.println("\n请输入一组数据:");
		int[] arr=new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("逆序:");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
