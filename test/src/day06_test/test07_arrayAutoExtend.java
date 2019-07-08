package day06_test;

import java.util.Arrays;
import java.util.Scanner;

public class test07_arrayAutoExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入数组元素的个数:");
//		int num=scanner.nextInt();
//		if (num>arr.length) {
//			arr=Arrays.copyOf(arr, num);
//		}
		System.out.println("请输入数据:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=scanner.nextInt();
//		}
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}
		int i=0;
		do {
			int ele=scanner.nextInt();
			if (ele==-1) {
				break;
			}
			if (i<arr.length) {
				arr[i]=ele;
			}else {
				arr=Arrays.copyOf(arr, i+1);
				arr[arr.length-1]=ele;
			}
			i++;
		} while (true);
		System.out.println("扩容后的数组:"+Arrays.toString(arr));
	}

}
