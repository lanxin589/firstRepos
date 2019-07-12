package day02;
/*
 * 4、在控制台输出九九乘法表（依据二维数组提供循环次数）：
 */
import java.util.Arrays;

public class test04_9_9Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] arr=new String[9][9];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Arrays.copyOf(arr[i], i+1);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				arr[i][j]=(i+1)+"*"+(j+1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
