package day05_test;

public class CopyArray_test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5,6,7,8,9};
		int[] arr2=new int[arr1.length];
		int index=0;
		for (int i : arr1) {
			arr2[index++]=i;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
