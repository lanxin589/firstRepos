package day06_test;

public class test04_InitSecondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
