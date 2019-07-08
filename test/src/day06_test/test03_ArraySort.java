package day06_test;

public class test03_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,3,1,5,4,6};
		for (int i = 0; i < arr.length-1; i++) {//轮数
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("排序后:");
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
