package day06_test;

public class test05_Traver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1},{1,2},{1,2,3}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
