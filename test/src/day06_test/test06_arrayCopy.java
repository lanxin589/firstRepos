package day06_test;

import java.util.Arrays;

public class test06_arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9};
		int arr1[]=new int[4];
		System.arraycopy(arr, 2, arr1, 0, 4);
		System.out.println(Arrays.toString(arr1));
	}

}
