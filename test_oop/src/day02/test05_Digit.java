package day02;

import java.util.Arrays;

/*
 * 在控制台输出如下：（依据二维数组提供循环次数）：
1 2 3 4 5 6
6 5 4 3 2 1
6 5 4 3 2 1
1 2 3 4 5 6
 */
public class test05_Digit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr=new int[4][6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==0||i==arr.length-1) {
					arr[i][j]=j+1;
				}else {
					arr[i][j]=arr[i].length-j;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
