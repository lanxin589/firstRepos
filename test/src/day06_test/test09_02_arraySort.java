package day06_test;

import java.util.Arrays;

public class test09_02_arraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{1,3,-1,5,-2};
		System.out.println("原数组:");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		int[] newArray=Arrays.copyOf(array, array.length);
		System.out.println("排序后数组:");
		System.out.println(Arrays.toString(newArray));
	}

}
