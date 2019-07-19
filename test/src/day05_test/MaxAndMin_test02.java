package day05_test;

import java.util.Scanner;

public class MaxAndMin_test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入5个成绩:");
		Scanner scanner=new Scanner(System.in);
		double[] arr=new double[5];
		double max=0,min=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		max=arr[0];
		min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]){
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nmax="+max+"    min="+min);
	}

}
