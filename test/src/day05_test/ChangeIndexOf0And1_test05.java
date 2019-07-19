package day05_test;

public class ChangeIndexOf0And1_test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6};
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
