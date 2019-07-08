package day05_test;

public class SortArray_test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 2 };
		int max = (arr[0] > arr[1]) ? (arr[0] > arr[2] ? arr[0] : arr[2]) : (arr[1] > arr[2] ? arr[1] : arr[2]);
		int min = (arr[0] < arr[1]) ? (arr[0] < arr[2] ? arr[0] : arr[2]) : (arr[1] < arr[2] ? arr[1] : arr[2]);
		int mid = arr[0] + arr[1] + arr[2] - (max + min);
		System.out.println("数组排序:" + min + " " + mid + " " + max);
	}

}
