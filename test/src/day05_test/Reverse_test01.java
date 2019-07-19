package day05_test;

public class Reverse_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		System.out.println("正序:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("\n逆序:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
